package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
    boolean existsByNameIgnoreCase(String name);
}