package com.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;
/*SimpleExecutor 使用后直接关闭Statement：closeStatement(stmt);*/
public class SimpleExecutor {

    // SimpleExecutor.java
    public int doUpdate(MappedStatement ms, Object parameter) throws SQLException {
        Statement stmt = null;
//中间省略……
    } finally {
        closeStatement(stmt);
    }
}

}
