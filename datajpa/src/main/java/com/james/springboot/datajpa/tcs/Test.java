package com.james.springboot.datajpa.tcs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    //Write a method that takes a list of Employee objects and finds and returns the employees list
    // whose salary is greater than 30000 and
    // works in IT department,
    // increment their salary by 5000 and
    // sort them in descending order as per their names alphabetically.
    //Employee object contains id, name, salary, department.

    public static void main(String[] args) {

        @Data
        @AllArgsConstructor
        class Employee {
            private int id;
            private String name;
            private int salary;
            private String department;

        }

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "AA",50000, "IT"));
        empList.add(new Employee(2, "BB",500, "IT"));
        empList.add(new Employee(3, "CC",30000, "IT"));
        empList.add(new Employee(4, "DD",31000, "IT"));


        List<Employee> filteredList = empList.stream().filter(val -> (val.getSalary() > 30000) && val.getDepartment() == "IT" ).
                map(val -> {
                    val.setSalary(val.getSalary()+5000);
                    return val;
                }).collect(Collectors.toList());
Collections.sort(filteredList, Collections.reverseOrder((e1,e2)-> e1.getName().compareTo(e2.getName())));
        System.out.println(filteredList);
    }

}
