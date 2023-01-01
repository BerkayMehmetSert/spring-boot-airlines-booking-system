package com.bms.airlinesbookingsystem.dto.request;

import com.bms.airlinesbookingsystem.helper.message.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseContactDetailRequest {
    @NotEmpty(message = ValidationMessage.ContactDetail.EMAIL_NOT_EMPTY)
    @NotNull(message = ValidationMessage.ContactDetail.EMAIL_NOT_NULL)
    @Email(regexp = ValidationMessage.General.EMAIL_REGEX,
            message = ValidationMessage.ContactDetail.EMAIL_NOT_VALID)
    private String email;

    @NotEmpty(message = ValidationMessage.ContactDetail.PHONE_NOT_EMPTY)
    @NotNull(message = ValidationMessage.ContactDetail.PHONE_NOT_NULL)
    @Pattern(regexp = ValidationMessage.General.PHONE_REGEX,
            message = ValidationMessage.ContactDetail.PHONE_NOT_VALID)
    private String phone;

    @NotEmpty(message = ValidationMessage.ContactDetail.STREET_NOT_EMPTY)
    @NotNull(message = ValidationMessage.ContactDetail.STREET_NOT_NULL)
    private String street;

    @NotEmpty(message = ValidationMessage.ContactDetail.STATE_ID_NOT_EMPTY)
    @NotNull(message = ValidationMessage.ContactDetail.STATE_ID_NOT_NULL)
    private String stateId;

    @NotEmpty(message = ValidationMessage.ContactDetail.PASSENGER_ID_NOT_EMPTY)
    @NotNull(message = ValidationMessage.ContactDetail.PASSENGER_ID_NOT_NULL)
    private String passengerId;
}
