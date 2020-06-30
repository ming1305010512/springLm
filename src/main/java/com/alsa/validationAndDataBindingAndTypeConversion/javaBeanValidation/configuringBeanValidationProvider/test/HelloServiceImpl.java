package com.alsa.validationAndDataBindingAndTypeConversion.javaBeanValidation.configuringBeanValidationProvider.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/24
 * @Time: 11:11
 * @Description:
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public Object hello(@NotNull @Min(10) Integer id, @NotNull String name) {
        return null;
    }
}
