package com.alsa.container.dependencies.methodInjection;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 18:58
 * @Description:
 */
public interface Command {

    void setState(Object commandState);

    Object execute();
}
