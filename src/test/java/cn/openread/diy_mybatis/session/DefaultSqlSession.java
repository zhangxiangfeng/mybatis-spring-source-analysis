package cn.openread.diy_mybatis.session;


import cn.openread.diy_mybatis.binding.MapperMethod;
import cn.openread.diy_mybatis.binding.MapperProxy;
import cn.openread.diy_mybatis.executor.Executor;

import java.lang.reflect.Proxy;

public class DefaultSqlSession implements SqlSession {
    private Configuration configuration;
    private Executor executor;

    public DefaultSqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public <T> T getMapper(Class<T> type) {
        //noinspection unchecked
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new MapperProxy<T>(this, type));
    }

    @Override
    public <T> T selectOne(MapperMethod mapperMethod, Object statement) throws Exception {
        System.out.println();
        return executor.query(mapperMethod, statement);
    }
}
