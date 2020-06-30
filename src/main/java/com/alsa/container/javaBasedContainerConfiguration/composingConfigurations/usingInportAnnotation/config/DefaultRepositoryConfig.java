package com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.config;

import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.AccountRepository;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/10
 * @Time: 10:03
 * @Description:
 */
public class DefaultRepositoryConfig implements RepositoryConfig {
    @Override
    public AccountRepository accountRepository() {
        return new AccountRepository();
    }
}
