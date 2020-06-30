package com.alsa.container.environmentAbstraction.beanDefinitionProfiles.useProfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/16
 * @Time: 19:28
 * @Description:
 */
@Configuration
@Profile("development")
public class DevelopmentConfig {
    @Bean
    public ProfileEntity getProfileEntity(){
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity.setProfileName("我是开发环境");
        return profileEntity;
    }
}
