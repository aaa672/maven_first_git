package com.hn.first.dao.impl;

import com.hn.first.commons.ResResult;
import com.hn.first.dao.idao.IUserDao;
import com.hn.first.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoImplTest {
    @Autowired
    IUserDao userDao;

    @Test
    public void login() throws Exception {
        ResResult<User> rr = userDao.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr2 = userDao.login("scott1","tiger");
    }
}