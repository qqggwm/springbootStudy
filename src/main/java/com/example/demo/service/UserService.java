package com.example.demo.service;

import com.example.demo.pojo.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    List<Person> queryList();

    void saveUser(Person person);

    void delUserById(int id);

    List<Person> queryListPage(Integer pageNow, Integer pageSize);

    Long totalCount();
}