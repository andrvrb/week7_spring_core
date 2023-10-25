package ru.egartech.database.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;

public class ConnectionPool  implements InitializingBean {
    private String username;
    private Integer poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(String username,
                          Integer poolSize,
                          List<Object> args,
                          Map<String, Object> properties) {
        this.username = username;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

    public ConnectionPool() {
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    // вариант 1 (без параметров и void)
    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    // вариант 2 (без параметров и void)
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
