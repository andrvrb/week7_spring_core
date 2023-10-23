package ru.egartech;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.database.repository.CompanyRepository;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");

        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);

        var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
        System.out.println(companyRepository);
    }
}