package com.alsa.container.additionalCapabilityOfApplicationContext.standardAndCustomEvent;

import org.springframework.context.ApplicationListener;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/17
 * @Time: 16:40
 * @Description:
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent blackListEvent) {
        System.out.println(blackListEvent.getSource()+"给"+blackListEvent.getAddress()+"发了一封邮件，邮件内容为："+blackListEvent.getContent()+",请通知"+notificationAddress);
    }
}
