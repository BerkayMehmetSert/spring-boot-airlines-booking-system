package com.bms.airlinesbookingsystem.dto.request;

import com.bms.airlinesbookingsystem.helper.message.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseTransactionRequest {
    @NotEmpty(message = ValidationMessage.Transaction.BOOKING_DATE_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Transaction.BOOKING_DATE_NOT_NULL)
    private LocalDate bookingDate;

    @NotEmpty(message = ValidationMessage.Transaction.DEPARTURE_DATE_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Transaction.DEPARTURE_DATE_NOT_NULL)
    private LocalDate departureDate;

    @NotEmpty(message = ValidationMessage.Transaction.PASSENGER_ID_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Transaction.PASSENGER_ID_NOT_NULL)
    private String passengerId;

    @NotEmpty(message = ValidationMessage.Transaction.FLIGHT_SCHEDULE_ID_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Transaction.FLIGHT_SCHEDULE_ID_NOT_NULL)
    private String flightScheduleId;

    @NotEmpty(message = ValidationMessage.Transaction.TYPE_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Transaction.TYPE_NOT_NULL)
    private String type;
}
