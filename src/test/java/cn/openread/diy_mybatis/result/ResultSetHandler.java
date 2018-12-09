package cn.openread.diy_mybatis.result;

import cn.openread.diy_mybatis.binding.MapperMethod;

import java.sql.PreparedStatement;

public interface ResultSetHandler {

    public <T> T handle(PreparedStatement pstmt, MapperMethod mapperMethod) throws Exception;
}
