package com.alsa.container.AnnotationConfiguration.withGenericQualifiers;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 13:39
 * @Description:
 */
public class StringStore implements Store<String> {
    @Override
    public void sale() {
        System.out.println("我是字符串，我正在卖东西");
    }
}
