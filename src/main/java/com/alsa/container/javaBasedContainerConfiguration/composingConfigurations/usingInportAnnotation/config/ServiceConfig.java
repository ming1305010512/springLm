package com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.config;

import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.TransferService;
import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/10
 * @Time: 9:56
 * @Description:
 */
@Configuration
public class ServiceConfig {
    @Autowired
    private RepositoryConfig repositoryConfig;

    @Bean
    public TransferService transferService(){
        return new TransferServiceImpl(repositoryConfig.accountRepository());
    }
}
