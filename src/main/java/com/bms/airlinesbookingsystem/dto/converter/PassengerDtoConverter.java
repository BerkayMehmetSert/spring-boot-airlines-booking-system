package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.PassengerDto;
import com.bms.airlinesbookingsystem.model.Passenger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassengerDtoConverter {
    private final PassengerContactDetailDtoConverter passengerContactDetailDtoConverter;
    private final PassengerTransactionDtoConverter passengerTransactionDtoConverter;

    public PassengerDtoConverter(PassengerContactDetailDtoConverter passengerContactDetailDtoConverter,
                                 PassengerTransactionDtoConverter passengerTransactionDtoConverter) {
        this.passengerContactDetailDtoConverter = passengerContactDetailDtoConverter;
        this.passengerTransactionDtoConverter = passengerTransactionDtoConverter;
    }

    public PassengerDto convert(Passenger from) {
        return new PassengerDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getAddress(),
                from.getAge(),
                from.getNationality(),
                from.getContactDetails() != null ? passengerContactDetailDtoConverter
                        .convert(from.getContactDetails()) : null,
                from.getTransactions() != null ? passengerTransactionDtoConverter
                        .convert(from.getTransactions()) : null
        );
    }

    public List<PassengerDto> convert(List<Passenger> from){
        return from.stream().map(this::convert).toList();
    }
}
