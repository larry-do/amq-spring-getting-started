package com.efasttask.codebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CodebaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodebaseApplication.class, args);
    }

}
