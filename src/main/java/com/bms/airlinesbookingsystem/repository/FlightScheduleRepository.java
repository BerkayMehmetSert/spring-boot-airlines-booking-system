package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule, String> {
}