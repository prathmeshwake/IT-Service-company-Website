package com.prathmeshwake.itservices.service;

import org.springframework.stereotype.Service;
import com.prathmeshwake.itservices.model.Contact;
import com.prathmeshwake.itservices.repository.ContactRepository;

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
