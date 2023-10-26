package ru.egartech.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;
import ru.egartech.database.repository.CrudRepository;

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
}
