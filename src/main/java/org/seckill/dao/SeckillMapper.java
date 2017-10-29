package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.pojo.Seckill;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SeckillMapper {

    public Integer insert(Seckill seckill);

    public List<Seckill> getSeckill();

    public Seckill getSeckillById(Long id);

    public Integer reduceNumber(@Param("id") Long id, @Param("nowTime") Date nowTime);

    public Integer update(Seckill seckill);

}