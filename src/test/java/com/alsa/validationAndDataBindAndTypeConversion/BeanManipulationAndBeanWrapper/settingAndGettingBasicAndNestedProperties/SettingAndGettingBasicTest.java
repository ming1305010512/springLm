package com.alsa.validationAndDataBindAndTypeConversion.BeanManipulationAndBeanWrapper.settingAndGettingBasicAndNestedProperties;

import com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.settingAndGettingBasicAndNestedProperties.Company;
import com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.settingAndGettingBasicAndNestedProperties.Employee;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.MyErrors;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.Person;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.PersonValidator;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.number.NumberFormatAnnotationFormatterFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/22
 * @Time: 19:17
 * @Description:
 */
public class SettingAndGettingBasicTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testBeanWrapper(){
        BeanWrapper company = new BeanWrapperImpl(new Company());
//        company.setPropertyValue("name","Some Company Inc.");
        PropertyValue value = new PropertyValue("name","Some Company Inc.");
        company.setPropertyValue(value);
        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name","Jim Stravinsky");
        jim.setPropertyValue("salary","10");
        company.setPropertyValue("managingDirector",jim.getWrappedInstance());
        System.out.println(company.getWrappedInstance());

        Float salary = (Float) company.getPropertyValue("managingDirector.salary");
        System.out.println(salary);

    }
}
