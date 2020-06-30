package com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider;

import com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.test.HelloService;
import com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.test.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/24
 * @Time: 10:30
 * @Description:
 */
@Configuration
@ComponentScan("com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation")
public class AppConfig {
    @Bean
    public MethodValidationPostProcessor validationPostProcessor(){
        MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
//        methodValidationPostProcessor.setValidator();
        return methodValidationPostProcessor;
    }
    @Bean
    public PersonForm personForm(){
        PersonForm personForm = new PersonForm(null,10);
        return personForm;
    }
}
