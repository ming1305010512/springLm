package com.alsa.container.containerExtensionPoint;

import com.alsa.container.beanDefinitionInheritance.ChildBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/5
 * @Time: 10:26
 * @Description:beanPostProcessor测试
 */
public class BeanPostProcessorTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testBeanPostProcessor(){
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        // User user = new User();
        // user.setUserName("longming");
        // List<User> users = sysUserMapper.selectUser(user);
        // for (User u : users) {
        // 	System.out.println(u);
        // }
        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/containerExtensionPoint/containerExtensionPoint.xml");
        ChildBean childBean = (ChildBean) context.getBean("childBean");
        System.out.println(childBean);

    }
}
