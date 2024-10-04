package com.estsoft.springdemoproject.controller;

import com.estsoft.springdemoproject.ioc.Member;
import com.estsoft.springdemoproject.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    public HelloController(HelloService service) { // 생성자 주입
        this.service = service;
    }

    @GetMapping("/hello") // 클라이언트에게 이러한 요청이 들어올 때
    public String hello(@RequestParam(value = "param", defaultValue = "Spring") String param) {
        // 객체 직접 생성, 호출
//        HelloService service = new HelloService();
//        return service.printHello(param);
//
//        return "Hello " + param;

        // spring에게 제어권 맡기기 (DI 사용해서)
        Member member = new Member(1,"jihyun","address"); // 그냥 이렇게 하기도 함
        return service.printHello(param);
    }
}
