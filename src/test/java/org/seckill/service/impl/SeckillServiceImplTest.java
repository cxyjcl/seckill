package org.seckill.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import static org.junit.Assert.*;

/**
 * Created by pohoulong on 2017/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-spring-mvc.xml","classpath:test-spring.xml","classpath:test-spring-mybatis.xml"})
public class SeckillServiceImplTest {
    @Test
    public void getSeckill() throws RepeatKillException,SeckillException {
        Integer num = 0;
        if(num==1){
            throw new RepeatKillException("num==1跑出的异常");
        } else if(num==2){
            throw new SeckillException("num等于其他数跑出的异常");
        }
        int count = 1/num;
    }

    @Test
    public void getSeckillById() throws Exception {

    }

    @Test
    public void exportSeckillUrl() throws Exception {

    }

    @Test
    public void getMD() throws Exception {

    }

    @Test
    public void executeSeckill() throws Exception {

    }

}