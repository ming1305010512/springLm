package com.alsa.container.additionalCapabilityOfApplicationContext.standardAndCustomEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 16:32
 * @Description:
 */
public class BlackListEvent extends ApplicationEvent {

    private final String address;
    private final String content;

    public BlackListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public String getContent() {
        return content;
    }
}
