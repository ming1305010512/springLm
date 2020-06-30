package com.alsa.container.AnnotationConfiguration.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/6
 * @Time: 13:59
 * @Description: 测试构造器注入
 */
public class MovieRecommenderWithConstructor {
    private MovieCatalog movieCatalog;
    private String name;

    @Autowired(required = false)
    public MovieRecommenderWithConstructor(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }
    @Autowired(required = false)
    public MovieRecommenderWithConstructor(MovieCatalog movieCatalog, String name) {
        this.movieCatalog = movieCatalog;
        this.name = name;
    }
}
