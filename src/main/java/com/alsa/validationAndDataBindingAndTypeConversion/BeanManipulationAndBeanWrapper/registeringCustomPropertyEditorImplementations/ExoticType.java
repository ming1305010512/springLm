package com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/23
 * @Time: 9:29
 * @Description:
 */
public class ExoticType {

    private String name;

    public ExoticType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExoticType{" +
                "name='" + name + '\'' +
                '}';
    }
}
