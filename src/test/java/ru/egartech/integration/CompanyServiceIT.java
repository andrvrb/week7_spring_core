package ru.egartech.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.egartech.ApplicationRunner;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationRunner.class)
public class CompanyServiceIT {
    @Test
    void findById() {

    }
}
