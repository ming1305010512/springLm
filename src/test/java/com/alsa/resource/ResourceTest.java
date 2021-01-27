package com.alsa.resource;

import com.alsa.container.additionalCapabilityOfApplicationContext.standardAndCustomEvent.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/12/30
 * @Time: 13:34
 * @Description:
 */
public class ResourceTest {

    @org.junit.Test
    public void testResource(){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/additionalCapabilityOfApplicationContext/standardAndCustomEvent/standardAndCustomerEvent.xml");
        Resource resource = context.getResource("com/alsa/resource/myTemplate.txt");
        System.out.println(resource);
    }
}
