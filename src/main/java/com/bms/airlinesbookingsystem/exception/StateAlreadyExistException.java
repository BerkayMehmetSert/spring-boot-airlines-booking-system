package com.bms.airlinesbookingsystem.exception;

public class StateAlreadyExistException extends RuntimeException {
    public StateAlreadyExistException(String message) {
        super(message);
    }
}
