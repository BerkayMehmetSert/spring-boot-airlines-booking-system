package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.FlightScheduleDto;
import com.bms.airlinesbookingsystem.model.FlightSchedule;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightScheduleDtoConverter {
    private final FlightScheduleAirCraftDtoConverter flightScheduleAirCraftDtoConverter;

    public FlightScheduleDtoConverter(FlightScheduleAirCraftDtoConverter flightScheduleAirCraftDtoConverter) {
        this.flightScheduleAirCraftDtoConverter = flightScheduleAirCraftDtoConverter;
    }

    public FlightScheduleDto convert(FlightSchedule from){
        return new FlightScheduleDto(
                from.getId(),
                from.getFlightDate(),
                from.getDeparture(),
                from.getArrival(),
                from.getAirCrafts() != null ? flightScheduleAirCraftDtoConverter.convert(from.getAirCrafts()) : null
        );
    }

    public List<FlightScheduleDto> convert(List<FlightSchedule> from){
        return from.stream().map(this::convert).toList();
    }
}
