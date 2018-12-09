package cn.openread.diy_mybatis.executor;


import cn.openread.diy_mybatis.binding.MapperMethod;

public interface Executor {

    <T> T query(MapperMethod method, Object parameter) throws Exception;
}
