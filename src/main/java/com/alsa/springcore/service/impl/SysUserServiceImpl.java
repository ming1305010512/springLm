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

    public SysUserMapper getSysUserMapper() {
        return sysUserMapper;
    }

    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }
}
