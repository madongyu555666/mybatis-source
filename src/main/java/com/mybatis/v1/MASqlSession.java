package com.mybatis.v1;

/**
 * Created by madongyu on 2019/5/12.
 */
public class MASqlSession {
    private MAConfiguration configuration;

    private MAExecutor executor;


    public MASqlSession(MAConfiguration configuration, MAExecutor executor){
        this.configuration = configuration;
        this.executor = executor;
    }
    public <T> T selectOne(String statementId, Object paramater){
        // 根据statementId拿到SQL
        String sql = MAConfiguration.sqlMappings.getString(statementId);
        if(null != sql && !"".equals(sql)){
            return executor.query(sql, paramater );
        }
        return null;
    }

    /**
     * 得到接口
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz){
        return configuration.getMapper(clazz, this);
    }




}
