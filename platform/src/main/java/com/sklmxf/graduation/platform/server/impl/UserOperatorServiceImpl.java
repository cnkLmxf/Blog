package com.sklmxf.graduation.platform.server.impl;

import com.sklmxf.graduation.platform.dao.UserOperatorDao;
import com.sklmxf.graduation.platform.entity.User;
import com.sklmxf.graduation.platform.server.UserOperatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserOperatorServiceImpl implements UserOperatorService {

    @Autowired
    private UserOperatorDao userOperatorDao;
    @Override
    public User getUserInfo(String email) {
        User userInfo = new User();
        try {
            userInfo = userOperatorDao.getUserInfo(email);
            return userInfo;
        } catch (Exception e) {
            log.error("getUserInfo function get datasource data error:" + e.getMessage());
        }
        return userInfo;
    }

    @Override
    public User addUser(User user) {
        try {
            userOperatorDao.addUser(user.getEmail(),user.getUserName());
            return user;
        } catch (Exception e) {
            log.error("getUserInfo function get datasource data error:" + e.getMessage());
        }
        return null;
    }

    @Override
    public User deleteUser(String email) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
