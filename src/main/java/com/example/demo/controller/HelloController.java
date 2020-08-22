package com.example.demo.controller;

import com.example.demo.pojo.Person;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author:weiming
 * @Date:2020/7/29 17:06
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String t1(){
        return  "hello";
    }


    @RequestMapping(value = "/JSR303",method = RequestMethod.POST)
    public String t2(@Valid Person person, BindingResult result){
        System.out.println(person);
        if(result.hasErrors()){
            for (ObjectError result1: result.getAllErrors()){
                System.out.println(result1.getDefaultMessage());
                return result1.getDefaultMessage();
            }

            return "error";
        }
        return "success";
    }
}
