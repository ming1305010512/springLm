package com.alsa.springcore;

import com.alsa.springcore.mapper.SysUserMapper;
import com.alsa.springcore.service.ISysUserService;
import com.hand.hap.account.dto.User;
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
import java.util.List;

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

	}
}
