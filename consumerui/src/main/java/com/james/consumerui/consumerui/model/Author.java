package com.james.consumerui.consumerui.model;

import lombok.Data;

import java.util.List;

@Data
public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private List courses;

}
