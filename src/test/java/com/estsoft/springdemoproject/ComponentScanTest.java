package com.estsoft.springdemoproject;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    @Test
    public void test() {
        // 스프링 컨테이너에 등록된 빈 확인을 위한 ApplicationContext 객체 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoProjectApplication.class);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("#bean name: " + beanName);
        }
    }
}
