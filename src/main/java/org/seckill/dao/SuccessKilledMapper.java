package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.pojo.SuccessKilled;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuccessKilledMapper {

    public Integer insert(@Param("seckillId") Long id, @Param("userPhone") Long userPhone);

    public List<SuccessKilled> getSuccessKilled();

    public SuccessKilled getSuccessKilledByIdAndPhone(@Param("seckillId") Long id, @Param("userPhone") Long userPhone);

}