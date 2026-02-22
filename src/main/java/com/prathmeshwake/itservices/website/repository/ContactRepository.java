package com.prathmeshwake.itservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prathmeshwake.itservices.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
