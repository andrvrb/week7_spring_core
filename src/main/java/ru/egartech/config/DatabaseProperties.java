package ru.egartech.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
//@Component
@ConfigurationProperties(prefix = "db")
public class DatabaseProperties {
         String username;
         String password;
         String driver;
         String url;
         String hosts;
         PoolProperties pool;
         List<PoolProperties> pools;
         Map<String, Object> properties;
        @Data
        @NoArgsConstructor
        public static class PoolProperties {
            private Integer size;
            private Integer timeout;
        }
}
