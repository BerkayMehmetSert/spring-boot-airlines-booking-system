package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, String> {
}