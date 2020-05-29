package com.alsa.springcore.mapper;

import com.hand.hap.account.dto.User;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/29
 * @Time: 17:07
 * @Description:
 */
public interface SysUserMapper {
	List<User> selectUser(User user);
}
