package com.alsa.container.environmentAbstraction.beanDefinitionProfiles.usePropertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 9:52
 * @Description:
 */
@Configuration
@PropertySource("classpath:com/alsa/container/environmentAbstraction/beanDefinitionProfiles/app.properties")
public class AppConfig {

    @Autowired
    Environment environment;

    @Bean
    public TestBean testBean(){
        TestBean testBean = new TestBean();
        testBean.setName(environment.getProperty("testbean.name"));
        return testBean;
    }
}
