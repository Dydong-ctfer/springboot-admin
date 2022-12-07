package com.dydong.springadmin.controller;

import com.dydong.springadmin.pojo.User;
import com.dydong.springadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public String login(String username, String password, Model model, HttpSession session){
        User user = userService.queryUserByName(username);
        if(user.getPassword().equals(password))
        {
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else{
            model.addAttribute("msg","用户名或密码错误!");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "redirect:/index.html";
    }
}
