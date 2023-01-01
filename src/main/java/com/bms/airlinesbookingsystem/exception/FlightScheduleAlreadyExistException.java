package com.bms.airlinesbookingsystem.exception;

public class FlightScheduleAlreadyExistException extends RuntimeException {
    public FlightScheduleAlreadyExistException(String message) {
        super(message);
    }
}
