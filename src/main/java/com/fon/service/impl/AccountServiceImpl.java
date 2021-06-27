package com.fon.service.impl;

import com.fon.dao.AccountDao;
import com.fon.entity.AccountEntity;
import com.fon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    //注入事务管理
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})

    @Override
    public AccountEntity validateAccount(String username, String password) {
        // 账号信息
        AccountEntity accountEntity = findByAccount(username);
        // 账号不存在或者密码错误
        if (accountEntity == null || !accountEntity.getPassword().equals(password)) {
            return null;
        }
        return accountEntity;
    }

    @Override
    public AccountEntity findByAccount(String account) {
        return accountDao.findByAccount(account);
    }
}
