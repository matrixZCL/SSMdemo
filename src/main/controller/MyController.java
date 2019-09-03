package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/test1")
    public String test1(){

        System.out.println("test1");

        return "redirect:/index.jsp";
    }

    @RequestMapping("/test2")
    public String test2(){

        System.out.println("test2");

        return "redirect:/index.jsp";
    }
}
