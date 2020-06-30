package com.alsa.AOP.aspectjSupport.introductions;

import org.springframework.stereotype.Service;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/28
 * @Time: 11:19
 * @Description:
 */
@Service
public class DefaultUsageTracked implements UsageTracked{
    @Override
    public void tracked() {
        System.out.println("默认的轨迹探索");
    }
}
