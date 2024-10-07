package com.estsoft.springdemoproject.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

// POJO (Plain Object Java Object)
@Getter
@Setter
@AllArgsConstructor // 생성자 대신 롬복 어노테이션으로 대체 가능
// @RequiredArgsConstructor
public class People {
    private final Long id;
    private final String name;
    private int age;
    private List<String> hobbies;
}