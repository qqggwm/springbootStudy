package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author:weiming
 * @Date:2020/8/19 11:27
 */
@Service
public class AsyncService {

    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("数据处理中");
    }
}
