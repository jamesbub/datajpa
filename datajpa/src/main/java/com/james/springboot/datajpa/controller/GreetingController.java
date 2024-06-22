package com.james.springboot.datajpa.controller;

import com.james.springboot.datajpa.models.Author;
import com.james.springboot.datajpa.service.AuthorService;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    @Lazy
    private final EurekaClient eurekaClient;
    private final AuthorService authorService;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/greeting")
    public String greeting() {
        List<Author> authors = authorService.getAllAuthors();
        return String.format(
                "Hello from '%s'!",  authors.toString());
    }
}
