package com.james.springboot.datajpa.test;

public interface B {
    default void runq(){
        System.out.println("B");
    }
}
