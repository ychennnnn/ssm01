package com.bj.dao;

import com.bj.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by ychen on 2020/2/11.
 */
public class AccountDaoTest {

    @Test
    public void run1() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao accountDao = session.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        session.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("啦啦啦");
        account.setMoney(1111f);
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao accountDao = session.getMapper(AccountDao.class);
        accountDao.saveAccount(account);
        session.commit();


        session.close();
        in.close();
    }

}