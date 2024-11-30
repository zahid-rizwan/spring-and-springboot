package com.learning;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling desktop application");
    }
}
