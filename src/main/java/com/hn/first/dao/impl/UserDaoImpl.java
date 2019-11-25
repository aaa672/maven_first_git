package com.hn.first.dao.impl;

import com.hn.first.commons.ResResult;
import com.hn.first.dao.idao.IUserDao;
import com.hn.first.dao.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public ResResult<User> login(String username, String password) throws Exception {
        if("scott".equals(username)&&"tiger".equals(password)){
            User user = new User(1001,"scott",null,1);
            return new ResResult<User>(200,"login succss", user);
        }else{
            return new ResResult<User>(404,"login error", null);
        }
    }
}
