package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirCraftRepository extends JpaRepository<AirCraft, String> {
    AirCraft findByNumber(String number);
}