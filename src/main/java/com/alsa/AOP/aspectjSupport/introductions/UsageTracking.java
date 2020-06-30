package com.alsa.AOP.aspectjSupport.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/28
 * @Time: 11:24
 * @Description:
 */
@Aspect
@Component
public class UsageTracking {

    @DeclareParents(value = "com.alsa.AOP.aspectjSupport.introductions.MyServiceImpl",defaultImpl = DefaultUsageTracked.class)
    public static UsageTracked mixin;

    @Before("execution(* service*(..))")
    public void recordUsage() {
        System.out.println("一个前置通知");
    }

}
