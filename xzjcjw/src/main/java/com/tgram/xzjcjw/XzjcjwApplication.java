package com.tgram.xzjcjw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.tgram.xzjcjw.mapper")
public class XzjcjwApplication {

    public static void main(String[] args) {
        SpringApplication.run(XzjcjwApplication.class, args);
    }
}
