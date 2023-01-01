package com.bms.airlinesbookingsystem.dto;

import java.util.List;

public record RouteDto(
        String id,
        String airport,
        String destination,
        String routeCode,
        List<RouteAirFareDto> airFares
) {
}
