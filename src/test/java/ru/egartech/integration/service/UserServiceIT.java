package ru.egartech.integration.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.integration.annotation.IT;
import ru.egartech.service.UserService;

@IT
@RequiredArgsConstructor
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UserServiceIT {

    private final UserService userService;
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
