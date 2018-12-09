package cn.openread;


import cn.openread.annomapper.AccountAnnoMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:cn/openread/xmlconfig/spring-mybatis.xml"})
@Slf4j
public class SimpleTest {

    @Autowired
    private AccountAnnoMapper accountAnnoMapper;

    @Test
    public void testUserMapper() {
        List<Account> accounts = accountAnnoMapper.selectAllById(20000);
        log.debug("{}", accounts);
    }
}
