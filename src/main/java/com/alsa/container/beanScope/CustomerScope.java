package com.alsa.container.beanScope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/4
 * @Time: 15:06
 * @Description:
 */
public class CustomerScope implements Scope {
    public Object get(String s, ObjectFactory<?> objectFactory) {
        return null;
    }

    public Object remove(String s) {
        return null;
    }

    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    public Object resolveContextualObject(String s) {
        return null;
    }

    public String getConversationId() {
        return null;
    }
}
