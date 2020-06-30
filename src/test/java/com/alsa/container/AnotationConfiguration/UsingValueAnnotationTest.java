package com.alsa.container.AnotationConfiguration;

import com.alsa.container.AnnotationConfiguration.usingValueAnnotation.MovieRecommender;
import com.alsa.container.AnnotationConfiguration.usingValueAnnotation.config.AppConfig;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 14:41
 * @Description: 测试@value注解
 */
public class UsingValueAnnotationTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testValueAnnotation(){
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        // User user = new User();
        // user.setUserName("longming");
        // List<User> users = sysUserMapper.selectUser(user);
        // for (User u : users) {
        // 	System.out.println(u);
        // }
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/AnnotationConfiguration/usingValueAnnotation/usingValueAnnotation.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        System.out.println(movieRecommender);


    }
}
