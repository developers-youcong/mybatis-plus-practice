package com.blog.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	
private static SqlSessionFactory sqlSessionFactory = null;
    
    public static SqlSessionFactory getSqlSessionFactory() {
        InputStream is  = null;
        if(sqlSessionFactory==null) {
            
            String resource = "mybatis/mybatis-config.xml";
            try {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
                return sqlSessionFactory;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
    
        }
    
        return sqlSessionFactory;
    }
        
}
