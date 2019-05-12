package com.mybatis.v1;


import com.mybatis.v1.mapper.BlogMapper;

public class MyBatisBoot {
    public static void main(String[] args) {
        MASqlSession sqlSession = new MASqlSession(new MAConfiguration(), new MAExecutor());
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }
}
