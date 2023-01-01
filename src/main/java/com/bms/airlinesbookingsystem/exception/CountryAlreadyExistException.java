package com.bms.airlinesbookingsystem.exception;

public class CountryAlreadyExistException extends RuntimeException {
    public CountryAlreadyExistException(String message) {
        super(message);
    }
}
