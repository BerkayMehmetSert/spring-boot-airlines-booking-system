package com.bms.airlinesbookingsystem.dto;


import java.time.LocalDate;
import java.util.List;

public record FlightScheduleDto(
        String id,
        LocalDate flightDate,
        LocalDate departure,
        LocalDate arrival,
        List<FlightScheduleAirCraftDto> airCrafts
) {
}
