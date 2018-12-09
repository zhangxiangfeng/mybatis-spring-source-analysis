package cn.openread.diy_mybatis;

import cn.openread.Account;

public interface DiyAccountMapper {
    Account getByTableId(Integer id);

}
