package com.mudit.mocky.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "<html><body><h1>Greetings from Spring Boot! Mudit</h1></body></html";
    }
}
