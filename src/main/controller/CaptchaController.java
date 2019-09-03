package main.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/captcha")
public class CaptchaController {
    @Autowired
    private HttpSession session;
    @RequestMapping("/code")
    public void getCaptcha()throws IOException {
        LineCaptcha captcha= CaptchaUtil.createLineCaptcha(100,30,5,10);
        session.setAttribute("realCode",captcha.getCode());
        HttpServletResponse response=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
        ServletOutputStream outputStream=response.getOutputStream();
        captcha.write(outputStream);
        outputStream.flush();

    }
}
