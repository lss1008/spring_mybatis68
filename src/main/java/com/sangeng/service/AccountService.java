package com.sangeng.service;

//2-1
public interface AccountService {
    /**
     * @param outId 转出账户的id
     * @param inId  转入
     * @param money 转账金额
     */
    void transfer(Integer outId, Integer inId, Double money);

}
