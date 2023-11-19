package ru.egartech.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.integration.annotation.IT;
import ru.egartech.service.UserService;

@IT
@RequiredArgsConstructor
public class UserServiceIT {

    private final UserService userService;
    @SpyBean(name = "pool1")
    private final ConnectionPool pool1;


    @Test
    void test() {
        System.out.println();
    }

    @Test
    void test2() {
        System.out.println();
    }
}
