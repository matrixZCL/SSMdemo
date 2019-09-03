package main.controller;

import main.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//测试ModelMap作用域
@Controller
@RequestMapping("/person")
@SessionAttributes({"person","username","map"})
public class PersonController {
    @RequestMapping("/show")
    public String showPerson(ModelMap modelMap){
        User user=new User("modelmap","mpdel","sss");
        modelMap.addAttribute("person",user);
        return "forward:/person.jsp";
    }

    @RequestMapping("/name")
    public String showName(Model model){
        model.addAttribute("username","dog");
        return "forward:/username.jsp";
    }
    @RequestMapping("/map")
    public String showMap(Map<String,Object> map){
        map.put("map","mapvalue");
        return "forward:/map.jsp";
    }

    @RequestMapping("/mav")
    public ModelAndView showModelAndView(ModelAndView modelAndView){
        modelAndView.addObject("mav",new User("mav","mmm","www"));
        modelAndView.setViewName("forward:/mav.jsp");
        return modelAndView;
    }
}
