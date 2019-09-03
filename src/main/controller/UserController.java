package main.controller;

import main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import main.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;
    @RequestMapping("/regist")

    public String regist(User user){
        System.out.println("regist");

        userService.regist(user);


        return "redirect:/login.html";
    }

//    public static void main(String[] args){
//        User user1=new User("12131","123123","123123");
//        System.out.println(user1.toString());
//    }
}
