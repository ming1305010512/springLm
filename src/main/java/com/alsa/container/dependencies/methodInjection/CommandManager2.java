package com.alsa.container.dependencies.methodInjection;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 19:40
 * @Description:
 */
public class CommandManager2 {

    private Command command;

    public void process(){
        System.out.println(command);
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
