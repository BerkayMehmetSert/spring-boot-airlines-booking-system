package com.bms.airlinesbookingsystem.dto;


public record StateDto(
        String id,
        String name,
        StateCountryDto country
) {
}
