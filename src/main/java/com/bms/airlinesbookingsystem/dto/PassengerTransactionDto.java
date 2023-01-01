package com.bms.airlinesbookingsystem.dto;

import java.time.LocalDate;

public record PassengerTransactionDto(
        String id,
        LocalDate bookingDate,
        LocalDate departureDate,
        String flightScheduleId,
        String type
) {
}
