package com.hn.first.dao.idao;

import com.hn.first.commons.ResResult;
import com.hn.first.dao.pojo.User;

public interface IUserDao {
    ResResult<User> login(String username, String password) throws Exception;
}
