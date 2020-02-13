package com.bj.dao;

import com.bj.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ychen on 2020/2/11.
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account (name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
