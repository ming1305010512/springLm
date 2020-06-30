package com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.settingAndGettingBasicAndNestedProperties;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/22
 * @Time: 19:13
 * @Description:
 */
public class Company {

    private String name;
    private Employee managingDirector;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(Employee managingDirector) {
        this.managingDirector = managingDirector;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", managingDirector=" + managingDirector +
                '}';
    }
}
