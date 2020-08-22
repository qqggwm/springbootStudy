package com.example.demo.mapper;

import com.example.demo.pojo.Person;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserMapper {

    List<Person> queryList();

    void saveUser(Person person);

    void delUserById(int id);

    List<Person> queryListPage(@Param("start") Integer start,@Param("row") Integer row);

    Long totalCount();
}
