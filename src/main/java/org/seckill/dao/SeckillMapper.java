package org.seckill.dao;

import org.seckill.pojo.Seckill;
import org.springframework.stereotype.Repository;

@Repository
public interface SeckillMapper {
    public Integer insert(Seckill seckill);
}