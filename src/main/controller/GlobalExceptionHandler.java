package main.controller;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GlobalExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String msg=e.getMessage();
//        httpServletRequest.setAttribute("msg",msg);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg",msg);
        modelAndView.setViewName("forward:/error.jsp");
        return modelAndView;

    }
}
