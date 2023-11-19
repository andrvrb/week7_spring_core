package ru.egartech.integration.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.service.UserService;

@SpringBootTest
public class UserServiceIT {

    @Autowired
    private UserService userService;

    @Autowired
    private ConnectionPool pool1;

    @Test
    void test() {
        System.out.println();
    }

    @Test
    void test2() {
        System.out.println();
    }
}
