package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        System.out.println("表现层的findAll方法执行了");
        //执行业务层方法
        List<Account> list = accountService.findAll();

        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView("success");

        mv.addObject("account", list);
        //跳转
        return mv;
    }

    /**
     * 保存账户
     * @param account
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层的saveAccount方法执行了");
        accountService.saveAccount(account);

        response.sendRedirect(request.getContextPath()+"/account/findAll");

    }
}
