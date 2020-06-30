package com.alsa.AOP.aspectjSupport.introductions;

import org.springframework.stereotype.Service;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/28
 * @Time: 11:24
 * @Description:
 */
@Service
public class MyServiceImpl implements IMyService {

    public void serviceMethod(){
        System.out.println("我是服务方法");
    }
}
