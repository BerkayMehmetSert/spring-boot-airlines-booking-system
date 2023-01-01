package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, String> {
}