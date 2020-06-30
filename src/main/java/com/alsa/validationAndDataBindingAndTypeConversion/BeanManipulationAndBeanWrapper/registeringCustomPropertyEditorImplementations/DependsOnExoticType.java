package com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/23
 * @Time: 9:30
 * @Description:
 */
public class DependsOnExoticType {

    private ExoticType type;

    public void setType(ExoticType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DependsOnExoticType{" +
                "type=" + type +
                '}';
    }
}
