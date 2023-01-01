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
public class BaseStateRequest {

    @NotEmpty(message = ValidationMessage.State.NAME_NOT_EMPTY)
    @NotNull(message = ValidationMessage.State.NAME_NOT_NULL)
    private String name;

    @NotEmpty(message = ValidationMessage.State.COUNTRY_ID_NOT_EMPTY)
    @NotNull(message = ValidationMessage.State.COUNTRY_ID_NOT_NULL)
    private String countryId;
}
