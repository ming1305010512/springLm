package com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider;

import org.hibernate.validator.constraints.Length;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotNull;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/24
 * @Time: 9:15
 * @Description:
 */
public class MyConstraintValidator implements ConstraintValidator<NotNull,String>{

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println(s);
        System.out.println("999");
        return false;
    }
}
