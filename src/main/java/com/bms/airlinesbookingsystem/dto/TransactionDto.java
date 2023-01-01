package com.bms.airlinesbookingsystem.dto;

import java.time.LocalDate;

public record TransactionDto(
        String id,
        LocalDate bookingDate,
        LocalDate departureDate,
        String passengerId,
        String flightScheduleId,
        String type
) {
}
