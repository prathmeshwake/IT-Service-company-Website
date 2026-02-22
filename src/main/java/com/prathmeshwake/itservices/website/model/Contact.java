package com.prathmeshwake.itservices.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Column(columnDefinition = "TEXT")
    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Contact() {}
    
    // Getters & Setters
}
