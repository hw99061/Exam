package com.example.demo.repository;

import com.example.demo.TestApplicationTests;
import com.example.demo.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends TestApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
        user.setUserAccount("user1");
        user.setEmail("user1@gmail.com");
        user.setPhoneNumber("010-1111-2222");
        user.setRegDt(LocalDateTime.now());
        user.setRegUser("shlee0882");

    }
}