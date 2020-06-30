package com.alsa.container.additionalCapabilityOfApplicationContext.i18UsingMessageSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 14:50
 * @Description:
 */
public class UsingMessageSourceTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testMessageSource(){

        MessageSource messageSource = new ClassPathXmlApplicationContext("com/alsa/container/additionalCapabilityOfApplicationContext/i18UsingMessageSource/i18UsingMessageSource.xml");
        String message = messageSource.getMessage("message",null,"Default", Locale.ENGLISH);
        System.out.println(message);
    }
    @org.junit.Test
    public void testMessageSource2(){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/additionalCapabilityOfApplicationContext/i18UsingMessageSource/i18UsingMessageSource.xml");
        Example example = (Example) context.getBean("example");
        example.execute();
    }
    @org.junit.Test
    public void testMessageSource3(){

        MessageSource messageSource = new ClassPathXmlApplicationContext("com/alsa/container/additionalCapabilityOfApplicationContext/i18UsingMessageSource/i18UsingMessageSource.xml");
        String message = messageSource.getMessage("argument.required",new Object[]{"userDao"},"Required", Locale.UK);
        System.out.println(message);
    }
}
