package com.bms.airlinesbookingsystem.dto;

public record AirFareDto(
        String id,
        Double fare,
        String routeId
) {
}
