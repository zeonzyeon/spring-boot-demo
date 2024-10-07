package com.estsoft.interf;

import org.springframework.stereotype.Service;

//@Primary
@Service
public class InterfImplA implements Interf {
    @Override
    public void method() {
        System.out.print("hi A");
    }
}
