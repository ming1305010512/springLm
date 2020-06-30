package com.alsa.validationAndDataBindAndTypeConversion.springTypeConversion;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/23
 * @Time: 15:49
 * @Description:
 */
public class springTypeConversionTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testCustomPropertyEditorImplementations(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/validationAndDataBindingAndTypeConversion/BeanManipulationAndBeanWrapper/registeringCustomPropertyEditorImplementations/registeringCustomPropertyEditorImplements.xml");
        ConversionService conversionService = (ConversionService) context.getBean("conversionService");
//        conversionService.convert("2",new TypeDescriptor())

    }
}
