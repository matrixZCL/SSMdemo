package main.controller;

import main.dto.AddressDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
public class AddressController {
    @RequestMapping("/add")
    public String add(AddressDTO addressDTO){
        System.out.println(addressDTO.getList());
        return null;
    }

}
