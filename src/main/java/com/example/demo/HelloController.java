package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hola, La app funciona correctamente";
    }

    @GetMapping("/api")
    public String api() {
        return "API funcionando correctamente";
    }
}