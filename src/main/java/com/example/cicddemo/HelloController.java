package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello CI/CD - v2";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
// webhook trigger Fri Jun 12 06:13:44 UTC 2026
// webhook trigger Fri Jun 12 06:25:49 UTC 2026
