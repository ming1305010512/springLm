package com.alsa.container.beanDefinitionInheritance;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/5
 * @Time: 10:19
 * @Description:
 */
public abstract class ParentBean {

    private String age;
    private String name;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
