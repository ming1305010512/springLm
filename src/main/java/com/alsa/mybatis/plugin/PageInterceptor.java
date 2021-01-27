package com.alsa.mybatis.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.sql.Connection;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2021/1/26
 * @Time: 15:26
 * @Description:
 */
@Intercepts(@Signature(method = "prepare",type = StatementHandler.class,args = {Connection.class,Integer.class}))
public class PageInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("我被拦截了");
        return invocation.proceed();
    }
}
