package com.estsoft.springdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // @ComponentScan도 포함하는 어노테이션
@ComponentScan(basePackages = {"com.estsoft.interf"})
public class SpringDemoProjectApplication {
    // 현재 프로젝트 패키지 기준으로 동작
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoProjectApplication.class, args);
    }
}
