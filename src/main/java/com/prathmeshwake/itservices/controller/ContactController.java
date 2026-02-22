package com.prathmeshwake.itservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ContactController {
    @PostMapping("/api/contact")
    public ResponseEntity<String> contact(@RequestBody Map<String, String> form) {
        String name = form.getOrDefault("name", "Guest");
        // placeholder: in production save to DB or send email
        return ResponseEntity.ok("Thanks " + name + ", we received your message.");
    }
}
