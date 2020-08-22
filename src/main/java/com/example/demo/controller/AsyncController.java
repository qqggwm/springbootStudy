package com.example.demo.controller;

import com.example.demo.service.AsyncService;
import org.hibernate.validator.cfg.context.Cascadable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:weiming
 * @Date:2020/8/19 11:28
 */
@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @GetMapping("/async")
    public String async(){

        asyncService.hello();

        return "ok";
    }
}
