package ru.egartech;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.egartech.database.pool.ConnectionPool;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");

        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);
    }
}