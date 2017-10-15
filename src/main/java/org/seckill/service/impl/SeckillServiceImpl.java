package org.seckill.service.impl;

import org.seckill.constants.SeckillStateEnum;
import org.seckill.dao.SeckillMapper;
import org.seckill.dao.SuccessKilledMapper;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.pojo.Seckill;
import org.seckill.pojo.SuccessKilled;
import org.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

import java.util.Date;

import java.util.List;

/**
 * Created by pohoulong on 2017/10/15.
 */
public class SeckillServiceImpl implements SeckillService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //加密盐值
    private String salt = "dfasdfvxcbcvb454651487*/-*";

    @Autowired
    private SeckillMapper seckillMapper;

    @Autowired
    private SuccessKilledMapper successKilledMapper;

    @Override
    public List<Seckill> getSeckill() {
        return seckillMapper.getSeckill();
    }

    @Override
    public Seckill getSeckillById(Long id) {
        return seckillMapper.getSeckillById(id);
    }

    @Override
    public Exposer ExportSeckillUrl(Long id) {
        Seckill seckill = getSeckillById(id);
        if (seckill == null) {
            return new Exposer(false, id);
        }
        long startTime = seckill.getStartTime().getTime();
        long endTime = seckill.getEndTime().getTime();
        long nowTime = new Date().getTime();
        if (startTime < nowTime || endTime > nowTime) {
            return new Exposer(false, nowTime, startTime, endTime, id);
        }
        String md = getMD(id);
        return new Exposer(true, md, id);
    }

    public String getMD(Long id) {
        String base = id + "/" + salt;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

    @Override
    public SeckillExecution executeSeckill(Long seckillId, Long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException {
        if (md5 != getMD(seckillId)) {
            throw new SeckillException("地址被篡改");
        }
        //执行秒杀：减库存 + 记录购买行为
        Date nowTime = new Date();
        int updateCount = seckillMapper.reduceNumber(seckillId, nowTime);
        if (updateCount <= 0) {
            throw new SeckillCloseException("秒杀已结束");
        }
        //记录购买行为
        int insertCount = successKilledMapper.insert(seckillId, userPhone);
        if (insertCount <= 0) {
            throw new RepeatKillException("重复秒杀");
        }
        SuccessKilled successKilled = successKilledMapper.getSuccessKilledByIdAndPhone(seckillId, userPhone);
        return new SeckillExecution(seckillId, SeckillStateEnum.SUCCESS_KILL,successKilled);
    }
}
