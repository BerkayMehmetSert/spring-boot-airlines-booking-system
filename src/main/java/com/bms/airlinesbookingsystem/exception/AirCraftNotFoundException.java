package com.bms.airlinesbookingsystem.exception;

public class AirCraftNotFoundException extends RuntimeException {
    public AirCraftNotFoundException(String message) {
        super(message);
    }
}
