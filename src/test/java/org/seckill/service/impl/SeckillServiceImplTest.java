package org.seckill.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillException;
import org.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    SeckillService service;

    @Test
    public void getSeckill() throws RepeatKillException,SeckillException {
        System.out.println(service.getSeckill());
    }

    @Test
    public void getSeckillById() throws Exception {
        System.out.println(service.getSeckillById(1000l));
    }

    @Test
    public void exportSeckillUrl() throws Exception {
        System.out.println(service.exportSeckillUrl(1000l));
    }

    @Test
    public void getMD() throws Exception {

    }

    @Test
    public void executeSeckill() throws Exception {
        System.out.println(service.executeSeckill(1000l,123131131l,"5379c86c7fed0f3231e8ec004e7f1691"));
    }

}