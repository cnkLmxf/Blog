package com.sklmxf.graduation.platform.server;

import com.sklmxf.graduation.platform.entity.User;

public interface UserOperatorService {

    public User getUserInfo(String email);

    public User addUser(User user);

    public User deleteUser(String email);

    public User updateUser(User user);
}
