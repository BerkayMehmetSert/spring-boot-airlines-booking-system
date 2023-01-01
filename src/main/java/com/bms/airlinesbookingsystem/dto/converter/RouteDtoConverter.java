package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.RouteDto;
import com.bms.airlinesbookingsystem.model.Route;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RouteDtoConverter {
    private final RouteAirFareDtoConverter routeAirFareDtoConverter;

    public RouteDtoConverter(RouteAirFareDtoConverter routeAirFareDtoConverter) {
        this.routeAirFareDtoConverter = routeAirFareDtoConverter;
    }

    public RouteDto convert(Route from) {
        return new RouteDto(
                from.getId(),
                from.getAirport(),
                from.getDestination(),
                from.getRouteCode(),
                from.getAirFares() != null ? routeAirFareDtoConverter.convert(from.getAirFares()) : null
        );
    }

    public List<RouteDto> convert(List<Route> from) {
        return from.stream().map(this::convert).toList();
    }
}
