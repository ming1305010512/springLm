package com.alsa.AOP.aspectjSupport.introductions;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/28
 * @Time: 13:15
 * @Description:
 */
public class IntroductionTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * 方法校验是需要aop代理支持的
     */
    @org.junit.Test
    public void testIntroduction(){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IMyService myService = (IMyService) context.getBean("myServiceImpl");
        myService.serviceMethod();
        UsageTracked usageTracked = (UsageTracked) myService;
        usageTracked.tracked();
    }
}
