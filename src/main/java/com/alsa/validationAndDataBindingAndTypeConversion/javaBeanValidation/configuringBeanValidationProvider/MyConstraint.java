package com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/24
 * @Time: 9:20
 * @Description:
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MyConstraintValidator.class)
public @interface MyConstraint {
}
