package com.alsa.container.AnnotationConfiguration.usingAutowired;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/6
 * @Time: 11:30
 * @Description:
 */
public class SimpleMovieLister {
    private Optional<MovieFinder> movieFinder;

    @Autowired
    public void setMovieFinder(Optional<MovieFinder> movieFinder){
        this.movieFinder = movieFinder;
    }
}
