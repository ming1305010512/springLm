package com.alsa.container.AnotationConfiguration;

import com.alsa.container.AnnotationConfiguration.withQualifiers.MovieRecommender;
import com.alsa.container.AnnotationConfiguration.withQualifiers.MovieRecommender2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 10:19
 * @Description: Qualifier测试
 */
public class WithQualifiersTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testQualifierd(){
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        // User user = new User();
        // user.setUserName("longming");
        // List<User> users = sysUserMapper.selectUser(user);
        // for (User u : users) {
        // 	System.out.println(u);
        // }
        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/AnnotationConfiguration/withQualifiers/withQualifiers.xml");
        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        MovieRecommender2 movieRecommender2 = (MovieRecommender2) context.getBean("movieRecommender2");
        System.out.println(movieRecommender);
        System.out.println(movieRecommender2);

    }
}
