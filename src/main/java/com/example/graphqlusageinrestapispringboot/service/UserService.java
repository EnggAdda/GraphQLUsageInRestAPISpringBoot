package com.example.graphqlusageinrestapispringboot.service;


import com.example.graphqlusageinrestapispringboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(int userId);

    public void insertUser(User user);


}
