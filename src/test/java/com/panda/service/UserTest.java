package com.panda.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.panda.model.User;
import com.panda.service.UserService;

public class UserTest {
	 
private UserService userService;
     
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userService");
    }
     
    @Test
    public void addUser(){
//        User user = new User();
//        user.setNickname("admin1");
//        user.setState(2);
//        user.setPassword("123456");
//        System.out.println(userService.insertUser(user));
        
    	User user = userService.getUser("admin");
    	System.out.println(user.getPassword());
        
    }
}