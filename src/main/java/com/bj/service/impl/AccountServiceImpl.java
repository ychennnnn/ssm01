package com.bj.service.impl;

import com.bj.dao.AccountDao;
import com.bj.entity.Account;
import com.bj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ychen on 2020/2/11.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {

        System.out.println("业务层：保存");
        accountDao.saveAccount(account);
    }
}
