package com.alsa.AOP.aspectjSupport.proxyingMechanisms;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/28
 * @Time: 16:56
 * @Description:
 */
public class SimplePojo implements Pojo{
    public void foo(){
        this.bar();
    }

    public void bar(){
        System.out.println("执行了bar方法");
    }
}
