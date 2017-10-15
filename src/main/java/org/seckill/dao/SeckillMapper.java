package org.seckill.dao;

import org.seckill.pojo.Seckill;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SeckillMapper {

    public Integer insert(Seckill seckill);

    public List<Seckill> getSeckill();

    public Seckill getSeckillById(Long id);

    public Integer reduceNumber(Long id, Date nowTime);

}