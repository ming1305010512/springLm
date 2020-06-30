package com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations;

import java.beans.PropertyEditorSupport;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/23
 * @Time: 9:34
 * @Description:
 */
public class ExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new ExoticType(text.toUpperCase()));
    }
}
