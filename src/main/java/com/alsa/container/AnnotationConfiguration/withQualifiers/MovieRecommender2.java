package com.alsa.container.AnnotationConfiguration.withQualifiers;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 10:54
 * @Description:
 */
public class MovieRecommender2 {

    @Autowired
    @Genre("Action")
    private MovieCatalog actionCatalog;

    private MovieCatalog comedyCatalog;

    @Autowired
    private void setComedyCatalog(@Genre("Comedy") MovieCatalog comedyCatalog){
        this.comedyCatalog = comedyCatalog;
    }
}
