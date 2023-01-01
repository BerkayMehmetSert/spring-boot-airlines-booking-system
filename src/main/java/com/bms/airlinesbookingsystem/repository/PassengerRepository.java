package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, String> {
    boolean existsByFirstNameIgnoreCase(String firstName);
    boolean existsByLastNameIgnoreCase(String lastName);
}