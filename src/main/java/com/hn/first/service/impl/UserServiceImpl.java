package com.hn.first.service.impl;

import com.hn.first.commons.ResResult;
import com.hn.first.dao.idao.IUserDao;
import com.hn.first.dao.pojo.User;
import com.hn.first.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    @Qualifier("userDao")
    private IUserDao userDao;

    @Override
    public ResResult<User> login(String username, String password) {
        ResResult<User> result = null;
        try {
            result = userDao.login(username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
