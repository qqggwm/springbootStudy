package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:weiming
 * @Date:2020/7/30 12:13
 */

//在templates下的页面只能controller访问，需要模板引擎支持

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
