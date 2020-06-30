package com.alsa.container.AnnotationConfiguration.usingValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 14:43
 * @Description:
 */
@Component
public class MovieRecommender {

    private final String catalog;

    public MovieRecommender(@Value("$(catalog.name#") String catalog){
        this.catalog = catalog;
    }
}
