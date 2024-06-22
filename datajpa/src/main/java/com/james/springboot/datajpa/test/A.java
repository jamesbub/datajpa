package com.james.springboot.datajpa.test;

public interface A {

    default void runq(){
        System.out.println("A");
    }
}
