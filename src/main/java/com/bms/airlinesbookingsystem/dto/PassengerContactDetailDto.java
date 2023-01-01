package com.bms.airlinesbookingsystem.dto;

public record PassengerContactDetailDto(
        String id,
        String email,
        String phone,
        String street,
        String stateId
) {
}
