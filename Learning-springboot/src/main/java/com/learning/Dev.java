package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //field injection
    @Autowired
    @Qualifier("desktop")
    Computer computer;
//constructor injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
//    setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        computer.compile();
        System.out.println("Building Demo");
    }
}
