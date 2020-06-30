package com.alsa.container.AnnotationConfiguration.withQualifiers;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/8
 * @Time: 10:23
 * @Description: 电影目录
 */
public class MovieCatalog {

    /**
     * 电影目录名称
     */
    private String catalogName;

    /**
     * 目录类型
     */
    private String catalogType;

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(String catalogType) {
        this.catalogType = catalogType;
    }
}
