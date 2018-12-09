package cn.openread.diy_mybatis.statement;


import cn.openread.diy_mybatis.binding.MapperMethod;
import cn.openread.diy_mybatis.result.DefaultResultSetHandler;
import cn.openread.diy_mybatis.result.ResultSetHandler;
import cn.openread.diy_mybatis.session.Configuration;
import cn.openread.diy_mybatis.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StatementHandler {
    private Configuration configuration;

    private ResultSetHandler resultSetHandler;

    public StatementHandler() {
    }

    public StatementHandler(Configuration configuration) {
        this.configuration = configuration;
        resultSetHandler = new DefaultResultSetHandler();
    }

    public <T> T query(MapperMethod method, Object parameter) throws Exception {

        Connection connection = DbUtil.open();
        PreparedStatement preparedStatement = connection.prepareStatement(String.format(method.getSql(), Integer.parseInt(String
                .valueOf(parameter))));
        preparedStatement.execute();
        return resultSetHandler.handle(preparedStatement, method);
    }
}
