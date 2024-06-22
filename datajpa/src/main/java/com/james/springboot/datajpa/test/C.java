package com.james.springboot.datajpa.test;

import com.james.springboot.datajpa.models.Author;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C implements A, B{
    @Override
    public void runq() {
        A.super.runq();
    }
}
