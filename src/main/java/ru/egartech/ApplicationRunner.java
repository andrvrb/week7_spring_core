package ru.egartech;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.egartech.config.ApplicationConfiguration;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.database.repository.CrudRepository;
import ru.egartech.database.repository.UserRepository;

public class ApplicationRunner {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {

            var connectionPool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyRepository = context.getBean("companyRepository", CrudRepository.class);
            var userRepository = context.getBean(UserRepository.class);
            System.out.println(companyRepository.findById(1));
        }
    }
}