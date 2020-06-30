package com.alsa.container.dependencies.methodInjection;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 19:00
 * @Description:
 */
public class AsyncCommand implements Command {

    private Object commandState;

    @Override
    public void setState(Object commandState) {
        this.commandState = commandState;
    }

    @Override
    public Object execute() {
        System.out.println("我在执行");
        return "执行结果";
    }
}
