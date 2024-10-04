package com.estsoft.springdemoproject.ioc;

public class A {
    Inter inter;

    public A(Inter inter) {
        this.inter = inter;
    }

    public void method() {
//        B objectB = new B();
//        objectB.methodB();

        C objectC = new C(); // 직접적인 제어 (직접 생성해서 사용)
        objectC.method();
    }

    public void method2() { // 제어의 역전
        inter.method();
    }
}
