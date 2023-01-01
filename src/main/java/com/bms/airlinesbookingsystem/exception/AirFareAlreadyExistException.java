package com.bms.airlinesbookingsystem.exception;

public class AirFareAlreadyExistException extends RuntimeException {
    public AirFareAlreadyExistException(String message) {
        super(message);
    }
}
