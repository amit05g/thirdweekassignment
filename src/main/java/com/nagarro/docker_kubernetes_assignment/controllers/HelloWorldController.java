package com.nagarro.docker_kubernetes_assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
    @GetMapping("/greeting-message")
    public String getMessage() {
        return "Hello World!! Good day!!";
    }
}
