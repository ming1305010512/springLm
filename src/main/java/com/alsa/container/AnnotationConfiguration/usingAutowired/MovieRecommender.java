package com.alsa.container.AnnotationConfiguration.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/6
 * @Time: 13:30
 * @Description:
 */
public class MovieRecommender {

    @Autowired
    private MovieCatalog[] movieCatalogs;

    @Autowired
    private Map<String,MovieCatalog> movieCatalogMap;
}
