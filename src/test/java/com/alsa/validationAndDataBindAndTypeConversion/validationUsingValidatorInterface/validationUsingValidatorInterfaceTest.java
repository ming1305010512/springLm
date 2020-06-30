package com.alsa.validationAndDataBindAndTypeConversion.validationUsingValidatorInterface;

import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.MyErrors;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.Person;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.PersonValidator;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.richObject.Address;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.richObject.AddressValidator;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.richObject.Customer;
import com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.richObject.CustomerValidator;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DefaultMessageCodesResolver;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/22
 * @Time: 15:49
 * @Description:
 */
public class validationUsingValidatorInterfaceTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testValidator(){
        Person person = new Person();
        person.setAge(101);
        person.setName("");
        PersonValidator validator = new PersonValidator();
        MyErrors errors = new MyErrors();
        validator.validate(person,errors);
    }
    @org.junit.Test
    public void testValidator2(){
        AddressValidator addressValidator = new AddressValidator();
        CustomerValidator customerValidator = new CustomerValidator(addressValidator);
        Address address = new Address();
        Customer customer = new Customer();
        customer.setAddress(address);
        MyErrors errors = new MyErrors();
        customerValidator.validate(customer,errors);
    }
}
