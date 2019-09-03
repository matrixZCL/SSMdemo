package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private HttpSession session;
    @RequestMapping("/login")
    public String login(String username,String password,String code){
        String realCode=(String)session.getAttribute("readCode");

        if(!code.equals(realCode)){
            return "redirect:/login.jsp";
        }
        if("zcl".equals(username)&&"123456".equals(password)){
            return "redirect:/index.jsp";
        }else{
            return "redirect:/login.jsp";
        }

    }
}
