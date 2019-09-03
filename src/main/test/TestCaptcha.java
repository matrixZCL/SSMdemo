package main.test;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.junit.Test;

import java.io.FileOutputStream;

public class TestCaptcha{
    @Test
    public void test1()throws Exception{
        LineCaptcha lineCaptcha=CaptchaUtil.createLineCaptcha(180,40);
        String code=lineCaptcha.getCode();
        System.out.println(code);
        lineCaptcha.write(new FileOutputStream("/Users/chenliangzhou/Desktop/captcha/a.jpg"));
    }
}
