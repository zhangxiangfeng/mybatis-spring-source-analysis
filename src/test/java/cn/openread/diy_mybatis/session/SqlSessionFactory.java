package cn.openread.diy_mybatis.session;

import cn.openread.diy_mybatis.executor.SimpleExecutor;

public class SqlSessionFactory {


    public SqlSession openSession(Configuration configuration) {
        return new DefaultSqlSession(configuration, new SimpleExecutor(configuration));
    }

}
