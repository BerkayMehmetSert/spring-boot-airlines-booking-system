package com.bms.airlinesbookingsystem.dto;

public record ContactDetailDto(
        String id,
        String email,
        String phone,
        String street,
        String stateId,
        String passengerId
) {
}
