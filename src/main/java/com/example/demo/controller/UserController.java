package com.example.demo.controller;


import com.example.demo.pojo.Person;
import com.example.demo.service.UserService;
import com.example.demo.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:weiming
 * @Date:2020/8/1 22:37
 */
@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/queryList")
    public List<Person> queryList(){
        List<Person> list =  userService.queryList();
        return list;
    }

    @RequestMapping("/t1")
    public String t1(){

        return "ok";
    }

    @PostMapping("save")
    public Result save(@RequestBody Person person){
        Result result = new Result();

        try {
            userService.saveUser(person);
            result.setMsg("用户信息保存成功");
        }catch (Exception e){
            result.setStatus(false);
            result.setMsg("用户信息保存失败");
        }
        return result;
    }

    @PostMapping("del")
    public Result del(int id){
        Result result = new Result();
        try {
            userService.delUserById(id);
            result.setMsg("删除成功");
        }catch (Exception e){
            result.setStatus(false);
            result.setMsg("删除用户失败");
        }
        return  result;
    }

    @GetMapping("getList")
    public Map<String,Object> getList(Integer pageNow,Integer pageSize){
        Map<String ,Object> map  = new HashMap<>();
        pageNow = pageNow==null?1:pageNow;
        pageSize = pageSize==null ?10:pageSize;
        List list = userService.queryListPage(pageNow,pageSize);
        Long total = userService.totalCount();

        map.put("user",list);
        map.put("total",total);

        return map;
    }

}
