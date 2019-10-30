package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * 表现层
 */
public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 新增账户
     * @param account
     */
    void saveAccount(Account account);
}
