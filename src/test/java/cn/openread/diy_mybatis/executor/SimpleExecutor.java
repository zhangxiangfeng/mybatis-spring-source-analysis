package cn.openread.diy_mybatis.executor;


import cn.openread.diy_mybatis.binding.MapperMethod;
import cn.openread.diy_mybatis.session.Configuration;
import cn.openread.diy_mybatis.statement.StatementHandler;

public class SimpleExecutor implements Executor {
    private Configuration configuration;

    public SimpleExecutor(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T query(MapperMethod method, Object parameter) throws Exception {
        StatementHandler statementHandler = new StatementHandler(configuration);
        return statementHandler.query(method, parameter);
    }
}
