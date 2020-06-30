package com.alsa.validationAndDataBindingAndTypeConversion.validationUsingValidatorInterface;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/22
 * @Time: 15:25
 * @Description:
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
        Person person = (Person) o;
        if (person.getAge()<0){
            errors.rejectValue("age","negativevalue");
        }else if (person.getAge()>100){
            errors.rejectValue("age","too.darn.old");
        }
    }
}
