package com.estsoft.springdemoproject.controller;

import com.estsoft.example.HiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
//    private HiService hiService;
//
//    public SampleController(HiService hiService) {
//        this.hiService = hiService;
//    }

    @GetMapping("/hello2")
    public String hello2() {
        // 비즈니스 로직 (model)
        return "hi";    // -> "hi.html"
    }
}
