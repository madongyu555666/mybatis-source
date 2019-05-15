package com.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;
/*ReuseExecutor 放在缓存中，可复用：PrepareStatement——getStatement()*/
public class ReuseExecutor{

    // ReuseExecutor.Java
    public int doUpdate(MappedStatement ms, Object parameter) throws SQLException {
//中间省略……
        Statement stmt = prepareStatement(handler, ms.getStatementLog());
//中间省略……
    }
    private Statement prepareStatement(StatementHandler handler, Log statementLog) throws
            SQLException {
        Statement stmt;
//中间省略……
        if (hasStatementFor(sql)) {
            stmt = getStatement(sql);
//中间省略……
        }
        private Statement getStatement(String s) {
            return statementMap.get(s);
        }

}
