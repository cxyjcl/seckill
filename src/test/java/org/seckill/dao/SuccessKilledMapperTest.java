package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by pohoulong on 2017/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-spring-mvc.xml","classpath:test-spring.xml","classpath:test-spring-mybatis.xml"})
public class SuccessKilledMapperTest {

    @Autowired
    private SuccessKilledMapper successKilledMapper;

    @Test
    public void insert() throws Exception {
        successKilledMapper.insert(1000l,121213213123l);
    }

    @Test
    public void getSuccessKilled() throws Exception {

    }

    @Test
    public void getSuccessKilledByIdAndPhone() throws Exception {

    }

}