package com.alsa.springcore.service;

import com.hand.hap.account.dto.User;

import java.util.List;

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
}
