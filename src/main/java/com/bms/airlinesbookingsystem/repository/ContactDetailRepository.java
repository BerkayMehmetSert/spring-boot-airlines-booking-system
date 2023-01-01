package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.ContactDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDetailRepository extends JpaRepository<ContactDetail, String> {
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
}