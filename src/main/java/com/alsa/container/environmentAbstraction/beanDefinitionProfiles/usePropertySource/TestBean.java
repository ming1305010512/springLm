package com.alsa.container.environmentAbstraction.beanDefinitionProfiles.usePropertySource;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 9:53
 * @Description:
 */
public class TestBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
