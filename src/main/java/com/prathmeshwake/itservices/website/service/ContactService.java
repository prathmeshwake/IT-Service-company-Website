package com.itservices.website.service;

import org.springframework.stereotype.Service;
import com.itservices.website.model.Contact;
import com.itservices.website.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public Contact save(Contact contact) {
        return repo.save(contact);
    }
}
