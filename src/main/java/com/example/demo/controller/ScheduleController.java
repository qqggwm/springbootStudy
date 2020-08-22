package com.example.demo.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:weiming
 * @Date:2020/8/20 11:36
 */
@RestController

public class ScheduleController {


    //@Scheduled(cron ="0/5 * * * * ? ")
    void schedule(){
        System.out.println("定时b");
    }
}
