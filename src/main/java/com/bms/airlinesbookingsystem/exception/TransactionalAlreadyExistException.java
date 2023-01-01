package com.bms.airlinesbookingsystem.exception;

public class TransactionalAlreadyExistException extends RuntimeException {
    public TransactionalAlreadyExistException(String message) {
        super(message);
    }
}
