package com.xb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages="com.xb.mapper")
@SpringBootApplication
public class Spa02Application {

    public static void main(String[] args) {
        SpringApplication.run(Spa02Application.class, args);
    }

}
