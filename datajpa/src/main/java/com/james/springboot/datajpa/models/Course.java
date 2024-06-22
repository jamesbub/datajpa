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
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;

    @ManyToMany
    private List<Author> authors;
    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
