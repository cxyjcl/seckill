package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.pojo.Seckill;

import java.util.List;

/**
 * Created by pohoulong on 2017/10/14.
 */
public interface SeckillService {

    /**
     * 获取所有秒杀商品
     *
     * @return List<Seckill>
     */
    List<Seckill> getSeckill();

    /**
     * 获取某一个秒杀商品
     *
     * @param id
     * @return Seckill
     */
    Seckill getSeckillById(Long id);

    /**
     * 获取秒杀地址
     *
     * @param id
     * @return
     */
    Exposer ExportSeckillUrl(Long id);

    /**
     * 执行秒杀操作
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return SeckillExecution
     * @throws SeckillException, RepeatKillException, SeckillCloseException
     */
    SeckillExecution executeSeckill(Long seckillId, Long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException;


}
