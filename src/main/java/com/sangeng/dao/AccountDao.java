package com.sangeng.dao;

import org.apache.ibatis.annotations.Param;

//3
public interface AccountDao {
    void updateMoney(@Param("id") Integer id, @Param("updateMoney") Double updateMoney);

}
