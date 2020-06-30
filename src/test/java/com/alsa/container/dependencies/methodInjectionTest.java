package com.alsa.container.dependencies;

import com.alsa.container.dependencies.methodInjection.CommandManager;
import com.alsa.container.dependencies.methodInjection.CommandManager2;
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
 * @Date: 2020/6/9
 * @Time: 19:36
 * @Description:
 */
public class methodInjectionTest {

    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void setup() throws IOException {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testMethodInjection() {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/alsa/container/dependencies/methodInjection/methodInjection.xml");
        CommandManager commandManager = (CommandManager) context.getBean("commandManager");
        CommandManager2 commandManager2 = (CommandManager2) context.getBean("commandManager2");
        for (int i = 0; i < 5; i++) {
            commandManager.process();
        }
        for (int i = 0; i < 5; i++) {
            commandManager2.process();
        }
    }
}
