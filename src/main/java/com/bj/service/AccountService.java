package com.bj.service;

import com.bj.entity.Account;

import java.util.List;

/**
 * Created by ychen on 2020/2/11.
 */
public interface AccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
