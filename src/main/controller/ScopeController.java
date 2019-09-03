package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/scope")
public class ScopeController {
    @Autowired
    private HttpSession session;
    @Autowired
    private HttpServletRequest httpServletRequest;
    @Autowired
    private HttpServletResponse httpServletResponse;
    @RequestMapping("/test1")
    public String test1(HttpSession session){
        session.setAttribute("user1","zcl");
        return "redirect:/scope.jsp";
    }

    @RequestMapping("/test2")
    public String test2(){
        System.out.println(session.getClass());
        session.setAttribute("user2","zcl2");
        return "redirect:/scope.jsp";
    }

    @RequestMapping("/test3")
    public String test3(){
        RequestAttributes requestAttributes=RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes=(ServletRequestAttributes) requestAttributes;
//        HttpServletRequest httpServletRequest=servletRequestAttributes.getRequest();
//        httpServletRequest.getSession().setAttribute("user3","zcl3",RequestAttributes.SCOPE_SESSION);
        servletRequestAttributes.setAttribute("user3","zcl3",RequestAttributes.SCOPE_SESSION);
        servletRequestAttributes.getRequest();
        return "redirect:/scope.jsp";
    }
}
