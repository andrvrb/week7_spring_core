package ru.egartech;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.database.repository.CompanyRepository;

public class ApplicationRunner {
    public static void main(String[] args) {
        // для destroy context должен закрываться явно
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            //      clazz -> String -> Map<String, Object>
            var connectionPool = context.getBean("p1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
        }
    }
}