package com.estsoft.interf;

import org.springframework.stereotype.Service;

@Service("interImplA")
public class InterImplA implements Inter {
    @Override
    public void method() {
        System.out.println("hi A");
    }
}
