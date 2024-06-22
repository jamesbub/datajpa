package com.james.springboot.datajpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Section {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int position;

    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
