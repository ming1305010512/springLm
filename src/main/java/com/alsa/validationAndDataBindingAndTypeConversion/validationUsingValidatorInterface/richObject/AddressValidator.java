package com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface.richObject;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/22
 * @Time: 16:18
 * @Description:
 */
public class AddressValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Address.class.equals(clazz);
//        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"path","路径不能为空");
    }
}
