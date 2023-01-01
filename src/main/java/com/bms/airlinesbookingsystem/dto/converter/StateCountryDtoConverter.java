package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.StateCountryDto;
import com.bms.airlinesbookingsystem.model.Country;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StateCountryDtoConverter {
    public StateCountryDto convert(Country from) {
        return new StateCountryDto(
                from.getId(),
                from.getName()
        );
    }

    public List<StateCountryDto> convert(List<Country> from) {
        return from.stream().map(this::convert).toList();
    }
}
