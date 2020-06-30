package com.alsa.container.AnnotationConfiguration.withGenericQualifiers;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 13:41
 * @Description:
 */
public class IntegerStore implements Store<Integer> {
    @Override
    public void sale() {
        System.out.println("我是整型，我正在卖东西");
    }
}
