package com.yunseong.flyway.configs;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class FlywayConfig {

    @Value("${spring.datasource.url}")
    private String URL;
    @Value("${spring.datasource.username}")
    private String USERNAME;
    @Value("${spring.datasource.password}")
    private String PASSWORD;

    @Bean
    @Profile("test")
    public Flyway flyway() {
        Flyway flyway = Flyway.configure().dataSource(this.URL, this.USERNAME, this.PASSWORD).load();
        return flyway;
    }
}
