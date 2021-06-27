package com.fon.service;

import com.fon.entity.AccountEntity;

public interface AccountService {
    /**
     * 登录检验
     * @param username  账号
     * @param password  密码
     * @return  登录成功返回账号信息；否则返回空
     */
    AccountEntity validateAccount(String username,String password);

    AccountEntity findByAccount(String account);
}
