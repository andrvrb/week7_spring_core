package ru.egartech.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;
import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.database.repository.CrudRepository;
import ru.egartech.database.repository.UserRepository;
import ru.web.config.WebConfiguration;

@Import(WebConfiguration.class)
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "ru.egartech",
        useDefaultFilters = false,
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, value = Component.class),
                @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
                @Filter(type = FilterType.REGEX, pattern = "ru\\..+Repository")
        })
public class ApplicationConfiguration {

        @Bean("pool2")
        @Scope(BeanDefinition.SCOPE_SINGLETON)
        public ConnectionPool pool2(@Value("${db.username}") String username) {
                return new ConnectionPool(username, 20);
        }

        @Bean
        public UserRepository userRepository(ConnectionPool pool2) {
                return new UserRepository(pool2);
        }
}
