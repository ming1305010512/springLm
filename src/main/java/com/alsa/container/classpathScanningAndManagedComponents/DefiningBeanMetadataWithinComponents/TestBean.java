package com.alsa.container.classpathScanningAndManagedComponents.DefiningBeanMetadataWithinComponents;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 13:36
 * @Description:
 */
public class TestBean {

    private int index;
    private String beanName;
    private String country;
    private TestBean spouse;

    public TestBean(String beanName) {
        this.beanName = beanName;
    }

    public TestBean(String beanName, int index) {
        this.index = index;
        this.beanName = beanName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TestBean getSpouse() {
        return spouse;
    }

    public void setSpouse(TestBean spouse) {
        this.spouse = spouse;
    }
}
