package com.estsoft.interf;

import com.estsoft.springdemoproject.ioc.Inter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InterDependencyService {
    private final Inter inter;

    // interface 타입으로 의존성 주입할 때 구현체 지정하는 방법 2가지
    // (단, 구현체가 하나일 경우엔 지정하지 않아도 됨)
    // 1. @Qulifier ("빈 이름(구현체) 지정")
    // 2. @Primary

    public InterDependencyService(@Qualifier("interImplA")Inter inter){
        this.inter = inter;
    }

    public void printMethod() {
        inter.method();
    }
}
