package com.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;
/*BatchExecutor 支持复用且可以批量执行update()，通过ps.addBatch()实现
handler.batch(stmt);*/
public class BatchExecutor{

    // BatchExecutor.Java
    public int doUpdate(MappedStatement ms, Object parameterObject) throws SQLException {
//中间省略……
        final Statement stmt;
//中间省略……
        stmt = statementList.get(last);
//中间省略……
        statementList.add(stmt);
        batchResultList.add(new BatchResult(ms, sql, parameterObject));
    }
handler.batch(stmt);
}

}
