package com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.test;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/24
 * @Time: 11:11
 * @Description:
 */
@Validated
public interface HelloService {
    Object hello(@NotNull @Min(10) Integer id, @NotNull String name);
}
