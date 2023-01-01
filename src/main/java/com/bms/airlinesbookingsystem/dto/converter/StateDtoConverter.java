package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.StateDto;
import com.bms.airlinesbookingsystem.model.State;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StateDtoConverter {
    private final StateCountryDtoConverter stateCountryDtoConverter;

    public StateDtoConverter(StateCountryDtoConverter stateCountryDtoConverter) {
        this.stateCountryDtoConverter = stateCountryDtoConverter;
    }

    public StateDto convert(State from) {
        return new StateDto(
                from.getId(),
                from.getName(),
                from.getCountry() != null ? stateCountryDtoConverter.convert(from.getCountry()) : null
        );
    }

    public List<StateDto> convert(List<State> from) {
        return from.stream().map(this::convert).toList();
    }
}
