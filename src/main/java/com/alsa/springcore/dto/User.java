package com.alsa.springcore.dto;

import java.beans.Transient;
import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/29
 * @Time: 11:12
 * @Description:
 */
public class User {
	private Long userId;
	private String userName;

	/**
	 * 作为查询条件，查询有这些电话号码的用户
	 */
	private List<String> phones;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				'}';
	}
}
