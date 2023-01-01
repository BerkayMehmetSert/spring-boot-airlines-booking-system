package com.bms.airlinesbookingsystem.dto.request;

import com.bms.airlinesbookingsystem.helper.message.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRouteRequest {
    @NotEmpty(message = ValidationMessage.Route.AIRPORT_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Route.AIRPORT_NOT_NULL)
    private String airport;

    @NotEmpty(message = ValidationMessage.Route.DESTINATION_NOT_EMPTY)
    @NotNull(message = ValidationMessage.Route.DESTINATION_NOT_NULL)
    private String destination;
}
