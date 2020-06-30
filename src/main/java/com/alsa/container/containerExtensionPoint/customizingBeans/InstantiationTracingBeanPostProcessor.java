package com.alsa.container.containerExtensionPoint.customizingBeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/5
 * @Time: 14:05
 * @Description:
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean,String beanName){
        System.out.println("初始化方法之前");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean '"+beanName+"' created :"+bean.toString());
        return bean;
    }
}

