package com.example.graphqlusageinrestapispringboot.controller;


import com.example.graphqlusageinrestapispringboot.entity.User;
import com.example.graphqlusageinrestapispringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


     @Autowired
    private UserService userService;
    private UserService userService1;


    @PostMapping("/insert")
    public void insertUser(@RequestBody User user){


         userService.insertUser(user);
     }


    @QueryMapping("getAllUsers")
    public List<User> getAllUsers(){


       return userService.getAllUsers();
    }

    @QueryMapping("findUserById")
    public User findUserById(@Argument int userId){


        return userService.getUserById(userId);
    }

}
