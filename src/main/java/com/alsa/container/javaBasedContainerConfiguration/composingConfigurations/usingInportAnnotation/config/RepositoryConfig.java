package com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.config;

import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/10
 * @Time: 10:02
 * @Description:
 */
@Configuration
public interface RepositoryConfig {

    @Bean
    AccountRepository accountRepository();
}
