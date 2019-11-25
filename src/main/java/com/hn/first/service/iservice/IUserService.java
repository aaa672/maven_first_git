package com.hn.first.service.iservice;

import com.hn.first.commons.ResResult;
import com.hn.first.dao.pojo.User;

public interface IUserService {
    ResResult<User> login(String username, String password);
}

