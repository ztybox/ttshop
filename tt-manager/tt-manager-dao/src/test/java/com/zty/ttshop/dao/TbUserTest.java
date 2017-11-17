package com.zty.ttshop.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/spring-dao-test.xml"})
public class TbUserTest {

    @Autowired
    private TbUserMapper userDao;

    @Test
    public void selectByPrimaryKey(){
        System.out.println(userDao.selectByPrimaryKey(4L));
    }
}
