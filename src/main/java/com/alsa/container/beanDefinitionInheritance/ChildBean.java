package com.alsa.container.beanDefinitionInheritance;


import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/5
 * @Time: 10:19
 * @Description:
 */
public class ChildBean implements InitializingBean {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ChildBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("我在初始化");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("我在初始化2");
    }
}
