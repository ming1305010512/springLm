package com.alsa.container.javaBasedContainerConfiguration;

import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.TransferService;
import com.alsa.container.javaBasedContainerConfiguration.composingConfigurations.usingInportAnnotation.config.SystemTestConfig;
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
 * @Date: 2020/6/10
 * @Time: 10:19
 * @Description:
 */
public class UsingImportAnnotationTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testImportAnnotation(){
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        // SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        // User user = new User();
        // user.setUserName("longming");
        // List<User> users = sysUserMapper.selectUser(user);
        // for (User u : users) {
        // 	System.out.println(u);
        // }
        ApplicationContext context = new AnnotationConfigApplicationContext(SystemTestConfig.class);
        TransferService transferService = context.getBean(TransferService.class);
        transferService.run();

    }
}
