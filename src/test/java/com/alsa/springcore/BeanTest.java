package com.alsa.springcore;

import com.alsa.springcore.mapper.SysUserMapper;
import com.alsa.springcore.service.ISysUserService;
import com.alsa.springcore.dto.User ;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/29
 * @Time: 11:13
 * @Description:
 */
public class BeanTest {

	private SqlSessionFactory sqlSessionFactory ;

	@Before
	public void setup() throws IOException {
		String resource = "config/mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void getBean(){
		// SqlSession sqlSession = sqlSessionFactory.openSession();
		// SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
		// User user = new User();
		// user.setUserName("longming");
		// List<User> users = sysUserMapper.selectUser(user);
		// for (User u : users) {
		// 	System.out.println(u);
		// }
		ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		ISysUserService userService = (ISysUserService) context.getBean("sysUserService");
		List<User> userList = userService.getUsers("longming");
		for (User u : userList) {
			System.out.println(u);
		}

		List<String> userNameList = userService.getUserName("longming2");
		for (String userName : userNameList) {
			System.out.println(userName);
		}

		String userName = userService.getUserName2("longming2");
		System.out.println(userName);

		User user = userService.getUser("longming2");
		System.out.println(user);

		Integer userId = userService.getUserId("longming2");
		System.out.println(userId);

	}

	@Test
	public void testMybatisForeachWithList(){
		ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		ISysUserService userService = (ISysUserService) context.getBean("sysUserService");
		User user = new User();
		List<String> phones = new ArrayList<>();
		phones.add("186");
		phones.add("13763784776");
		user.setPhones(phones);
		List<User> userList = userService.queryUserWithPhone(user);
		for (User u : userList) {
			System.out.println(u);
		}
	}
}
