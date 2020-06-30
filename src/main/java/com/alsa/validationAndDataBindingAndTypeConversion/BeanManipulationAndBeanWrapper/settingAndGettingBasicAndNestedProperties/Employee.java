package com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.settingAndGettingBasicAndNestedProperties;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/22
 * @Time: 19:15
 * @Description:
 */
public class Employee {

    private String name;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
