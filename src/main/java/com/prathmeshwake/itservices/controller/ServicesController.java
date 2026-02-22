package com.prathmeshwake.itservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class ServicesController {
    @GetMapping("/api/services")
    public List<Map<String, String>> getServices() {
        return List.of(
            Map.of("name", "Web Development", "description", "Modern, responsive websites with SEO and performance."),
            Map.of("name", "Mobile Apps", "description", "Native and cross-platform apps that delight users."),
            Map.of("name", "Cloud & DevOps", "description", "CI/CD, containers, and scalable cloud architectures."),
            Map.of("name", "Security", "description", "Application and infrastructure security best practices.")
        );
    }
}
