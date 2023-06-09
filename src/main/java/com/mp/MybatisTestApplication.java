package com.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mp.mapper")
@SpringBootApplication
public class MybatisTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class, args);
    }

}
