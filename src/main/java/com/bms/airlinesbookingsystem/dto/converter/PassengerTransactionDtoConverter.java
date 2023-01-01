package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.PassengerTransactionDto;
import com.bms.airlinesbookingsystem.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassengerTransactionDtoConverter {
    public PassengerTransactionDto convert(Transaction from) {
        return new PassengerTransactionDto(
                from.getId(),
                from.getBookingDate(),
                from.getDepartureDate(),
                from.getFlightSchedule() != null ? from.getFlightSchedule().getId() : null,
                from.getType()
        );
    }

    public List<PassengerTransactionDto> convert(List<Transaction> from) {
        return from.stream().map(this::convert).toList();
    }
}
