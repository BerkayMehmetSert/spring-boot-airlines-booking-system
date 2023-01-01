package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.AirFare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirFareRepository extends JpaRepository<AirFare, String> {
}