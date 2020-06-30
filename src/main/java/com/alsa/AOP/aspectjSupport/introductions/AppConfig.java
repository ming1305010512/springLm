package com.alsa.AOP.aspectjSupport.introductions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/28
 * @Time: 11:20
 * @Description:
 */
@Configuration
@ComponentScan("com.alsa.AOP.aspectjSupport.introductions")
@EnableAspectJAutoProxy
public class AppConfig {
}
