package com.alsa.springcore.mapper;

import com.alsa.springcore.dto.User ;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/29
 * @Time: 17:07
 * @Description:
 */
@Repository
public interface SysUserMapper {
	List<User> selectUser(User user);
}
