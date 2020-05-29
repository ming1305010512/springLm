package com.alsa.springcore.mapper.impl;

import com.alsa.springcore.mapper.SysUserMapper;
import com.hand.hap.account.dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/5/29
 * @Time:22:20
 */
public class SysUserMapperFactory {

    private static SysUserMapper sysUserMapper;
    public static SysUserMapper createSysUserMapper() {
        String resource = "config/mybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        return sysUserMapper;
    }
}
