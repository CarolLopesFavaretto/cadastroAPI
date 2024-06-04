package com.br.cadastrosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMyApplication {

    public static void main(String[] args) {
        SpringApplication.from(CadastrosApiApplication::main).with(MyContainersConfiguration.class)
                .run(args);
    }
}
