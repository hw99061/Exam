package com.example.demo;

import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRepositoryTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        UserRepositoryTest test = new UserRepositoryTest();
        test.create();
    }

}
