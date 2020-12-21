package com.alsa.springcore.service.impl;

import com.alsa.springcore.mapper.SysUserMapper;
import com.alsa.springcore.service.ISysUserService;
import com.alsa.springcore.dto.User ;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/5/29
 * @Time:21:50
 */
public class SysUserServiceImpl implements ISysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public List<User> getUsers(String name) {
        User user = new User();
        user.setUserName(name);
        List<User> mapList = sysUserMapper.selectUser(user);
        return mapList;
    }

    @Override
    public User getUser(String name) {
        User user = new User();
        user.setUserName(name);
        User user2 = sysUserMapper.selectUser2(user);
        return user2;
    }

    public List<String> getUserName(String name){
        User user = new User();
        user.setUserName(name);
        List<String> userNameList = sysUserMapper.selectUserName(user);
        return userNameList;
    }

    @Override
    public String getUserName2(String name) {
        User user = new User();
        user.setUserName(name);
        String userName = sysUserMapper.selectUserName2(user);
        return userName;
    }

    @Override
    public Integer getUserId(String name) {
        User user = new User();
        user.setUserName(name);
        Integer userId = sysUserMapper.selectUserId(user);
        return userId;
    }

    @Override
    public List<User> queryUserWithPhone(User user) {
        List<User> users = sysUserMapper.selectUserWithPhone(user);
        return users;
    }


    public SysUserMapper getSysUserMapper() {
        return sysUserMapper;
    }

    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }
}
