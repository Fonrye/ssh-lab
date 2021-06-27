package com.fon.dao;

import com.fon.entity.AccountEntity;

public interface AccountDao {

    /**
     * 账号用户信息
     * @param username  账号
     * @return
     */
    AccountEntity findByAccount(String username);

}
