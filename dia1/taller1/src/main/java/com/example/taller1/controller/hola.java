package com.example.taller1.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class hola {
    @GetMapping
    public String testEndpoint() {
        return "Test endpoint is working!";
    }
}
