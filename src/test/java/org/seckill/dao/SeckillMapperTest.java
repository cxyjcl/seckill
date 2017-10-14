package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.pojo.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;

/**
 * Created by pohoulong on 2017/9/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-spring-mvc.xml","classpath:test-spring.xml","classpath:test-spring-mybatis.xml"})
public class SeckillMapperTest {

    @Autowired
    private SeckillMapper seckillMapper;

    @Test
    public void testInsertSeckill(){
        Seckill seckill = new Seckill();
        seckill.setName("1000秒杀iphone");
        seckill.setStartTime(new Date());
        seckill.setNumber(100);
        System.out.println(seckill);
        seckillMapper.insert(seckill);
    }

}