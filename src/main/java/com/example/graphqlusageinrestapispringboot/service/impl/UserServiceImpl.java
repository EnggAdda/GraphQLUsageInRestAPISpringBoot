package com.example.graphqlusageinrestapispringboot.service.impl;

import com.example.graphqlusageinrestapispringboot.entity.User;
import com.example.graphqlusageinrestapispringboot.repo.UserRepo;
import com.example.graphqlusageinrestapispringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return userRepo.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
    }

    @Override
    public void insertUser(User user) {
       userRepo.save(user);
    }
}
