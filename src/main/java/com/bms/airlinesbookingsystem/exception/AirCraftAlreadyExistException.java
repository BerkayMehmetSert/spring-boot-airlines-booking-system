package com.bms.airlinesbookingsystem.exception;

public class AirCraftAlreadyExistException extends RuntimeException {
    public AirCraftAlreadyExistException(String message) {
        super(message);
    }
}
