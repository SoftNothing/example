package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层
 */
@Repository("accountDao")
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
   // @Select("select  * from account")
    List<Account> findAll();

    /**
     * 新增账户
     * @param account
     */
   // @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
