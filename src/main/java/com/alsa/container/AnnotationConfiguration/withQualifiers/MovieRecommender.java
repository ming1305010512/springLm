package com.alsa.container.AnnotationConfiguration.withQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 10:22
 * @Description: 电影推荐类
 */
public class MovieRecommender {

    @Autowired
    @Qualifier("action")
    private MovieCatalog movieCatalog;
}
