package com.alsa.container.dependencies.methodInjection;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 18:57
 * @Description:
 */
public abstract class CommandManager {
    public void process(){
        Command command = createCommand();
        System.out.println(command);
        command.execute();
    }

    protected abstract Command createCommand();
}
