package cn.openread.diy_mybatis;


import cn.openread.Account;
import cn.openread.diy_mybatis.session.Configuration;
import cn.openread.diy_mybatis.session.DefaultSqlSession;
import cn.openread.diy_mybatis.session.SqlSessionFactory;
import cn.openread.diy_mybatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class DiyMybatisTest {

    @Test
    public void test() throws IOException {
        InputStream inputStream = DiyMybatisTest.class.getClassLoader().getResourceAsStream(
                "cn/openread/diy_mybatis/mybatis-config.xml");
        Configuration configuration = new Configuration();
        configuration.setInputStream(inputStream);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        DefaultSqlSession sqlSession = (DefaultSqlSession) sqlSessionFactory.openSession(configuration);
        DiyAccountMapper userMapper = sqlSession.getMapper(DiyAccountMapper.class);
        Account user = userMapper.getByTableId(30000);
        System.out.println(user);
    }
}
