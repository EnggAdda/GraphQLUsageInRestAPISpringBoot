package com.example.graphqlusageinrestapispringboot.repo;

import com.example.graphqlusageinrestapispringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
