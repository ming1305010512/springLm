package com.alsa.container.additionalCapabilityOfApplicationContext.standardAndCustomEvent;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 16:49
 * @Description:
 */
public class StandardAndCustomEventTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testCustomEvent(){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/additionalCapabilityOfApplicationContext/standardAndCustomEvent/standardAndCustomerEvent.xml");
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.sendEmail("john.doe@example.org","John ,你好，我在测试spring的事件发布");
        emailService.sendEmail("john.doe@example.org","my-event");
    }
}
