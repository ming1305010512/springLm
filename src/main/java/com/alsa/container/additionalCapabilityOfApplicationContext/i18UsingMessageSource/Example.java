package com.alsa.container.additionalCapabilityOfApplicationContext.i18UsingMessageSource;

import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 14:57
 * @Description:
 */
public class Example {

    private MessageSource message;

    public void setMessage(MessageSource message) {
        this.message = message;
    }

    public void execute(){
        String message = this.message.getMessage("argument.required",new Object[]{"userDao"},"Required", Locale.ENGLISH);
        System.out.println(message);
    }
}
