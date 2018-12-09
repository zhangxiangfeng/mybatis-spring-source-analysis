package cn.openread.diy_mybatis.session;


import cn.openread.diy_mybatis.binding.MapperMethod;

public interface SqlSession {
    <T> T selectOne(MapperMethod mapperMethod, Object statement) throws Exception;

}
