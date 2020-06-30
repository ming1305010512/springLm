package com.alsa.container.classpathScanningAndManagedComponents.DefiningBeanMetadataWithinComponents;


import com.alsa.container.classpathScanningAndManagedComponents.DefiningBeanMetadataWithinComponents.FactoryMethodComponent;
import com.alsa.container.classpathScanningAndManagedComponents.DefiningBeanMetadataWithinComponents.TestBean;
import com.alsa.container.classpathScanningAndManagedComponents.DefiningBeanMetadataWithinComponents.config.AppConfig;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 13:46
 * @Description:
 */
public class definingBeanMetadataWithinComponents {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testValueAnnotation(){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FactoryMethodComponent factoryMethodComponent = (FactoryMethodComponent) context.getBean("factoryMethodComponent");
        System.out.println(factoryMethodComponent);
    }
}
