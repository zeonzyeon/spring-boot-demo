package com.estsoft.interf;

import org.springframework.stereotype.Service;

@Service
public class InterfImplB implements Interf {
    @Override
    public void method() {
        System.out.print("hi B");
    }
}
