package com.alsa.container.AnnotationConfiguration.usingValueAnnotation.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 14:43
 * @Description:
 */
@Configuration
@PropertySources(@PropertySource("classpath:com/alsa/container/AnnotationConfiguration/usingValueAnnotation/properties/application.properties"))
@ComponentScan("com.alsa.container.AnnotationConfiguration.usingValueAnnotation")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setPlaceholderPrefix("$(");
        propertySourcesPlaceholderConfigurer.setPlaceholderSuffix("#");
        return propertySourcesPlaceholderConfigurer;
    }
}
