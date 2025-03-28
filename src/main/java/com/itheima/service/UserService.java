package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @ author: bin
 * @ version :1.0
 */
public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);

    User findByUserName1(String username,String password);

    //注册
    void register(String username, String password);

    //更新
    void update(User user);

    //更新头像
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
