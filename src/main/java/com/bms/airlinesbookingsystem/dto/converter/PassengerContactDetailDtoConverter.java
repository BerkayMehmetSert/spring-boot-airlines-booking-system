package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.PassengerContactDetailDto;
import com.bms.airlinesbookingsystem.model.ContactDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassengerContactDetailDtoConverter {
    public PassengerContactDetailDto convert(ContactDetail from) {
        return new PassengerContactDetailDto(
                from.getId(),
                from.getEmail(),
                from.getPhone(),
                from.getStreet(),
                from.getState() != null ? from.getState().getId() : null
        );
    }

    public List<PassengerContactDetailDto> convert(List<ContactDetail> from) {
        return from.stream().map(this::convert).toList();
    }
}
