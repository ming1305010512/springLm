package com.alsa.container.additionalCapabilityOfApplicationContext.standardAndCustomEvent.UsingAnnotation;

import com.alsa.container.additionalCapabilityOfApplicationContext.standardAndCustomEvent.BlackListEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/18
 * @Time: 10:24
 * @Description:
 */
public class BlackListNotifier3 {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener(condition = "#blackListEvent.content == 'my-event'")
    @Order(3)
    public void processBlackListEvent(BlackListEvent blackListEvent){
        System.out.println("使用注解的方式3："+blackListEvent.getSource()+"给"+blackListEvent.getAddress()+"发了一封邮件，邮件内容为："+blackListEvent.getContent()+",请通知"+notificationAddress);
    }
}
