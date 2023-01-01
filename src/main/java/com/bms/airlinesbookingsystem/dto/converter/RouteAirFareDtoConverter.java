package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.RouteAirFareDto;
import com.bms.airlinesbookingsystem.model.AirFare;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RouteAirFareDtoConverter {
    public RouteAirFareDto convert(AirFare from) {
        return new RouteAirFareDto(
                from.getId(),
                from.getFare()
        );
    }

    public List<RouteAirFareDto> convert(List<AirFare> from) {
        return from.stream().map(this::convert).toList();
    }
}
