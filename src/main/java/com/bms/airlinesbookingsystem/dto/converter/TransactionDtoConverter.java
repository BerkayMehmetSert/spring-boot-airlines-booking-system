package com.bms.airlinesbookingsystem.dto.converter;

import com.bms.airlinesbookingsystem.dto.TransactionDto;
import com.bms.airlinesbookingsystem.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionDtoConverter {
    public TransactionDto convert(Transaction from) {
        return new TransactionDto(
                from.getId(),
                from.getBookingDate(),
                from.getDepartureDate(),
                from.getPassenger() != null ? from.getPassenger().getId() : null,
                from.getFlightSchedule() != null ? from.getFlightSchedule().getId() : null,
                from.getType()
        );
    }

    public List<TransactionDto> convert(List<Transaction> from) {
        return from.stream().map(this::convert).toList();
    }
}
