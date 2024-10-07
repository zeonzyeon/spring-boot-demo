package com.estsoft.interf;

import org.springframework.stereotype.Service;

@Service("interImplB")
public class InterImplB implements Inter{
    @Override
    public void method() {
        System.out.println("hi B");
    }
}
