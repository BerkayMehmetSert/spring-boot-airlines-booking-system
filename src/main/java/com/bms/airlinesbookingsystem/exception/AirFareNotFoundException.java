package com.bms.airlinesbookingsystem.exception;

public class AirFareNotFoundException extends RuntimeException {
    public AirFareNotFoundException(String message) {
        super(message);
    }
}
