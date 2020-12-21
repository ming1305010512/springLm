package com.alsa.springcore.service;

import com.alsa.springcore.dto.User ;

import java.util.List;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/5/29
 * @Time:21:50
 */
public interface ISysUserService {

    /**
     * 获取用户信息
     *
     * @param name
     * @return
     */
    List<User> getUsers(String name);
    User getUser(String name);

    List<String> getUserName(String name);
    String getUserName2(String name);

    Integer getUserId(String name);

    List<User> queryUserWithPhone(User user);
}
