package ru.egartech;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.egartech.config.ApplicationConfiguration;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.database.repository.CrudRepository;
import ru.egartech.database.repository.UserRepository;
import ru.egartech.service.CompanyService;

public class ApplicationRunner {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            /*
            try (var context = new AnnotationConfigApplicationContext()) {
            context.register(ApplicationConfiguration.class);
            context.getEnvironment().setActiveProfiles("web", "prod");
            context.refresh();
            */

            var connectionPool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyService = context.getBean(CompanyService.class);
            System.out.println(companyService.findById(1));
        }
    }
}