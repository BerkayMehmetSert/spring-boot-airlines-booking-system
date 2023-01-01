package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.FlightScheduleAirCraftDto;
import com.bms.airlinesbookingsystem.model.AirCraft;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightScheduleAirCraftDtoConverter {
    public FlightScheduleAirCraftDto convert(AirCraft from) {
        return new FlightScheduleAirCraftDto(
                from.getId(),
                from.getNumber(),
                from.getCapacity()
        );
    }

    public List<FlightScheduleAirCraftDto> convert(List<AirCraft> from) {
        return from.stream().map(this::convert).toList();
    }
}
