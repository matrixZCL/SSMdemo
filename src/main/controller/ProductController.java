package main.controller;

import main.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/add")
    public String add(Product product){
        System.out.println(product);
        return "redirect:/addProduct.jsp";
    }
}
