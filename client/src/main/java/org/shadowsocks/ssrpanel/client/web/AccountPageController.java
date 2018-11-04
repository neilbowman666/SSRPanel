package org.shadowsocks.ssrpanel.client.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountPageController {

    // TODO 登录页面
    @GetMapping("/login")
    public String loginPage() {
        return null;
    }

    // TODO 注册页面
    @GetMapping("/register")
    public String registerPage() {
        return null;
    }

    // TODO 忘记密码
    @GetMapping("/forget_password")
    public String passwordResetPage() {
        return null;
    }

    // TODO 登录提交
    @PostMapping("/login")
    public String login() {
        return null;
    }

    // TODO 注册提交
    @PostMapping("/register")
    public String register() {
        return null;
    }

    // TODO 密码提交
    @PostMapping("/password")
    public String passwordReset() {
        return null;
    }
}
