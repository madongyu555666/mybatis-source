package com.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

public class MAConfiguration {
    public static final ResourceBundle sqlMappings;

    static{
        sqlMappings = ResourceBundle.getBundle("v1sql");
    }

    public <T> T getMapper(Class clazz, MASqlSession sqlSession) {
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new MAMapperProxy(sqlSession));
    }


}
