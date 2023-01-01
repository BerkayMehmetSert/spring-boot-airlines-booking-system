package com.bms.airlinesbookingsystem.exception;

public class TransactionalNotFoundException extends RuntimeException {
    public TransactionalNotFoundException(String message) {
        super(message);
    }
}
