package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import main.service.UserService;

@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/test")
    public String print(){
        System.out.println("/test");

        return null;
    }
}
