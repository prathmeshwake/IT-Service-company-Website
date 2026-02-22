package com.itservices.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itservices.website.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
