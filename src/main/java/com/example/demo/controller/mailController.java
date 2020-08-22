package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:weiming
 * @Date:2020/8/19 12:41
 */
@RestController
public class mailController {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @GetMapping("sendMail")
    String send(){
        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setSubject("这是java发送的邮件");
        simpleMessage.setText("weiming");
        simpleMessage.setFrom("@qq.com");
        simpleMessage.setTo("@qq.com");
        javaMailSender.send(simpleMessage);

        return "发送成功";
    }


}
