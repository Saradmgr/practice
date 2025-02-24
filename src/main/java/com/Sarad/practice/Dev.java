package com.Sarad.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

   // @Autowired  //field Injection
   //@Qualifier("desktop")
    private Computer comp;

    //Constructor Injection
//    public Dev(Computer comp) {
//        this.comp = comp;
//    }


    public void build(){
        comp.compile();
        System.out.println("I am Building Something");
    }

    @Autowired
    @Qualifier("desktop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
