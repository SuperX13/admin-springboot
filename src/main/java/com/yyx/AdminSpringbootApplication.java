package com.yyx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yyx.mapper")
public class AdminSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminSpringbootApplication.class, args);
    }

}
