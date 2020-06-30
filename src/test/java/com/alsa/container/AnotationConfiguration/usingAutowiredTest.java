package com.alsa.container.AnotationConfiguration;

import com.alsa.container.AnnotationConfiguration.usingAutowired.MovieRecommender;
import com.alsa.container.AnnotationConfiguration.usingAutowired.MovieRecommenderWithConstructor;
import com.alsa.container.AnnotationConfiguration.usingAutowired.SimpleMovieLister;
import com.alsa.container.beanDefinitionInheritance.ChildBean;
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
 * @Date: 2020/6/5
 * @Time: 10:26
 * @Description:bean定义继承测试
 */
public class usingAutowiredTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testAutowired(){
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        // User user = new User();
        // user.setUserName("longming");
        // List<User> users = sysUserMapper.selectUser(user);
        // for (User u : users) {
        // 	System.out.println(u);
        // }
        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/AnnotationConfiguration/usingAutowired/usingAutowired.xml");
        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) context.getBean("simpleMovieLister");
        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        MovieRecommenderWithConstructor movieRecommenderWithConstructor = (MovieRecommenderWithConstructor) context.getBean("movieRecommenderWithConstructor");
        System.out.println(simpleMovieLister);
        System.out.println(movieRecommender);
        System.out.println(movieRecommenderWithConstructor);

    }
}
