package main.test;

import org.springframework.beans.factory.annotation.Autowired;
import main.service.UserService;

public class Test2 {
    @Autowired
    private static UserService userService;
    public static void main(String[] args){
        System.out.println(userService);

    }
}
