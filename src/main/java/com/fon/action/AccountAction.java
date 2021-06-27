package com.fon.action;

import com.fon.entity.AccountEntity;
import com.fon.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class AccountAction extends ActionSupport implements SessionAware {
    private String username;
    private String password;
    private Map<String, Object> session;
    //注入bean
    @Resource
    private AccountService accountService;

    public String login() {
        AccountEntity result = accountService.validateAccount(getUsername(), getPassword());
        // 登录失败跳转到登录页面
        if(result == null){
            ServletActionContext.getRequest().setAttribute("msg", "用户名或者密码错误，请重新登录！");
            return "login";
        }
        // 登录成功
        session.put("result", result);
        String role = result.getUsertype();
        if ("系统管理员".equals(role)) {
            return "admin";
        } else if ("检测员".equals(role)) {
            return "inspector";
        } else if ("技术人员".equals(role)) {
            return "technician";
        }
        return "default";
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
