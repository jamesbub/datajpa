package com.james.springboot.datajpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne
    private Section section;

    @OneToOne
    private Resource resource;
}
