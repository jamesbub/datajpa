package com.james.consumerui.consumerui.controller;

import com.james.consumerui.consumerui.model.Author;
import com.james.consumerui.consumerui.model.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EurekaController {

    @Autowired
    private GreetingClient greetingClient;

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        try {
            ResponseEntity<List<Author>> authors = greetingClient.getAuthors();
            List<String> names = authors.getBody().stream().map(v -> v.getFirstName() + " " + v.getLastName()).toList();
            model.addAttribute("greeting", names.toString());
        } catch (Exception e) {
            model.addAttribute("greeting", e.getMessage());
        }
        return "greeting-view";
    }

}
