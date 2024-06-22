package com.james.consumerui.consumerui.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("datajpa")
public interface GreetingClient {

    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping(path = "james/get",method = RequestMethod.POST)
    ResponseEntity<List<Author>> getAuthors();
}
