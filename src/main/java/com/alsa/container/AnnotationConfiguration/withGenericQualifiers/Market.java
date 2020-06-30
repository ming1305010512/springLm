package com.alsa.container.AnnotationConfiguration.withGenericQualifiers;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 13:42
 * @Description:
 */
public class Market {

    @Autowired
    private Store<String> s1 ;

    @Autowired
    private Store<Integer> s2;

    public void execute(){
        s1.sale();
        s2.sale();
    }
}
