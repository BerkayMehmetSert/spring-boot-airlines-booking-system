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
public class BaseAirCraftRequest {
    @NotEmpty(message = ValidationMessage.AirCraft.CAPACITY_NOT_EMPTY)
    @NotNull(message = ValidationMessage.AirCraft.CAPACITY_NOT_NULL)
    private Integer capacity;

    @NotEmpty(message = ValidationMessage.AirCraft.MANUFACTURER_NOT_EMPTY)
    @NotNull(message = ValidationMessage.AirCraft.MANUFACTURER_NOT_NULL)
    private String manufacturer;

    @NotEmpty(message = ValidationMessage.AirCraft.MANUFACTURE_DATE_NOT_EMPTY)
    @NotNull(message = ValidationMessage.AirCraft.MANUFACTURE_DATE_NOT_NULL)
    private LocalDate manufactureDate;

    @NotEmpty(message = ValidationMessage.AirCraft.FLIGHT_SCHEDULE_ID_NOT_EMPTY)
    @NotNull(message = ValidationMessage.AirCraft.FLIGHT_SCHEDULE_ID_NOT_NULL)
    private String flightScheduleId;
}
