package com.alsa.validationAndDataBindAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations;

import com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations.DependsOnExoticType;
import com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations.ExoticType;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.TypeDescriptor;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/23
 * @Time: 9:39
 * @Description:
 */
public class CustomPropertyEditorImplementationsTest {

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
        DependsOnExoticType dependsOnExoticType = (DependsOnExoticType) context.getBean("sample");
        System.out.println(dependsOnExoticType);

    }
    @org.junit.Test
    public void testUsingPropertyEditorRegister(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/validationAndDataBindingAndTypeConversion/BeanManipulationAndBeanWrapper/registeringCustomPropertyEditorImplementations/usingPropertyEditorRegister/usingPropertyEditorRegister.xml");
        DependsOnExoticType dependsOnExoticType = (DependsOnExoticType) context.getBean("sample");
        System.out.println(dependsOnExoticType);
    }
}
