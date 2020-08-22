package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:weiming
 * @Date:2020/8/16 22:34
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Person> queryList() {
        List list = new ArrayList();
        list = userMapper.queryList();
        return list;
    }

    @Override
    public void saveUser(Person person) {
        userMapper.saveUser(person);
    }

    @Override
    public void delUserById(int id) {
        userMapper.delUserById(id);
    }

    @Override
    public List<Person> queryListPage(Integer pageNow, Integer pageSize) {
        int start = (pageNow-1)*pageSize;
        return userMapper.queryListPage(start, pageSize);
    }

    @Override
    public Long totalCount() {

        return userMapper.totalCount();
    }
}
