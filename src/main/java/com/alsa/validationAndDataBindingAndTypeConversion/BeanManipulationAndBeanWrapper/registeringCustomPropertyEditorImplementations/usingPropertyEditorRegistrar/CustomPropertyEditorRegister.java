package com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations.usingPropertyEditorRegistrar;

import com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations.ExoticType;
import com.alsa.validationAndDataBindingAndTypeConversion.BeanManipulationAndBeanWrapper.registeringCustomPropertyEditorImplementations.ExoticTypeEditor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/23
 * @Time: 10:53
 * @Description:
 */
public class CustomPropertyEditorRegister implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(ExoticType.class,new ExoticTypeEditor());
        //还可以在这里注册更多的属性编辑器
    }
}
