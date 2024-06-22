package com.james.springboot.datajpa.repository;

import com.james.springboot.datajpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
