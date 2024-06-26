package com.br.cadastrosapi;


import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

@TestConfiguration(proxyBeanMethods = false)
public class MyContainersConfiguration {

    @Bean
    @ServiceConnection(name = "postgres")
    PostgreSQLContainer<?> container() {
        return new PostgreSQLContainer<>("postgres:14.3-alpine");
    }
}
