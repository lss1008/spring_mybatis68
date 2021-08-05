package com.sangeng.service.impl;

import com.sangeng.dao.AccountDao;
import com.sangeng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//2-2
@Service
public class AccountServiceImpl implements AccountService {

    //4
    @Autowired
    private AccountDao accountDao;

    @Transactional
    @Override
    public void transfer(Integer outId, Integer inId, Double money) {
        //增加
        accountDao.updateMoney(inId, money);
        //System.out.println(1/0);
        //减少
        accountDao.updateMoney(outId, -money);
    }
}
