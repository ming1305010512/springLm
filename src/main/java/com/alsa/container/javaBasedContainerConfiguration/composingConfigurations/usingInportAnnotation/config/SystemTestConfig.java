package com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/10
 * @Time: 10:15
 * @Description:
 */
@Configuration
@Import({ServiceConfig.class,DefaultRepositoryConfig.class})
public class SystemTestConfig {
}
