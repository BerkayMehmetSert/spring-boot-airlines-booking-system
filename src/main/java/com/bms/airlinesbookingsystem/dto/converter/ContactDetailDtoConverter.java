package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.ContactDetailDto;
import com.bms.airlinesbookingsystem.model.ContactDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactDetailDtoConverter {
    public ContactDetailDto convert(ContactDetail from) {
        return new ContactDetailDto(
                from.getId(),
                from.getEmail(),
                from.getPhone(),
                from.getStreet(),
                from.getState() != null ? from.getState().getId() : null,
                from.getPassenger() != null ? from.getPassenger().getId() : null
        );
    }

    public List<ContactDetailDto> convert(List<ContactDetail> from) {
        return from.stream().map(this::convert).toList();
    }
}
