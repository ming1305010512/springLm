package com.alsa.validationAndDataBindAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider;

import com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.AppConfig;
import com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.PersonForm;
import com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.test.HelloService;
import com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.test.HelloServiceImpl;
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
 * @Date: 2020/6/24
 * @Time: 9:31
 * @Description:
 */
public class ConfiguringBeanValidationProviderTest {

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
    public void testConfiguringBeanValidationProvider(){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonForm personForm = context.getBean(PersonForm.class);
        System.out.println(personForm);
        HelloService helloService = (HelloService) context.getBean("helloServiceImpl");
        helloService.hello(21,null);
        System.out.println(helloService);
    }
}
