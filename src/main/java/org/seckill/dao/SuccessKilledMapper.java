package org.seckill.dao;

import org.seckill.pojo.SuccessKilled;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuccessKilledMapper {

    public Integer insert(Long id, Long userPhone);

    public List<SuccessKilled> getSuccessKilled();

    public SuccessKilled getSuccessKilledByIdAndPhone(Long id, Long userPhone);


}