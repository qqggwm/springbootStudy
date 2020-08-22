package com.example.demo;

import com.example.demo.pojo.Person;
import com.example.demo.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.BindingResult;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private  UserServiceImpl userService;

	@Test
	void t1(){
		Person person = new Person();
		person.setId(24);
		person.setName("王吧");
		person.setPwd("888888");
		System.out.println(person);
		userService.saveUser(person);
	}

	@Test
	void querylist(){
		List<Person> list = new ArrayList();
		list = userService.queryList();
		for (Person p:list) {
			System.out.println(p);
		}
	}


	@Test
	void del(){
		userService.delUserById(24);
	}

	@Test
	void pageList2(){
		Map<String ,Object> map  = new HashMap<>();
		map.put("user",userService.queryListPage(1,10));
		map.put("total",userService.totalCount());

		System.out.println(map);
//		System.out.println(userService.totalCount());
	}
}
