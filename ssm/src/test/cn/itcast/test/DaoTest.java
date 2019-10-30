package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DaoTest {
    private InputStream in;
    private SqlSession session;
    private AccountDao accountDao;

    /**
     * 初始化参数
     */
    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        session = factory.openSession();
        accountDao = session.getMapper(AccountDao.class);
    }

    @After
    public void destory() throws IOException {
        session.commit();
        session.close();
        in.close();
    }

    /**
     * findAll
     */
    @Test
    public void testFindAll(){
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    /**
     * saveAccount
     */
    @Test
    public void saveAccount(){
        Account account = new Account();
        account.setName("关羽");
        account.setMoney(400d);

        accountDao.saveAccount(account);
    }
}
