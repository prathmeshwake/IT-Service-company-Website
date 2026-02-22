package com.itservices.website.controller;

import org.springframework.web.bind.annotation.*;
import com.itservices.website.model.Contact;
import com.itservices.website.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public String saveMessage(@RequestBody Contact contact) {
        service.save(contact);
        return "Message received! We will contact you soon.";
    }
}
