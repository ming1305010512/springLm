package com.alsa.container.classpathScanningAndManagedComponents.DefiningBeanMetadataWithinComponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/9
 * @Time: 13:32
 * @Description:
 */
@Component
public class FactoryMethodComponent {

    private static int i;

    @Autowired
    @Qualifier("protected")
    private TestBean testBean;

    @Bean
    @Qualifier("public")
    public TestBean publicInstance(){
        return new TestBean("publicInstance");
    }

    @Bean
    @Qualifier("protected")
    protected TestBean protectedInstance(@Qualifier("public") TestBean spouse, @Value("#{privateInstance.beanName}") String beanName){
        TestBean tb = new TestBean("protectedInstance",1);
        tb.setSpouse(spouse);
        tb.setBeanName(beanName);
        return tb;
    }

    @Bean
    private TestBean privateInstance(){
        return new TestBean("privateInstance",i++);
    }

//    @Bean
//    @RequestScope
//    public TestBean requestScopedInstance(){
//        return new TestBean("requestScopedInstance",3);
//    }
}
