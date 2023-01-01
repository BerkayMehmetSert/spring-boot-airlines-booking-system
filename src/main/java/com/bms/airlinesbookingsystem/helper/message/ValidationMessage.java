package com.bms.airlinesbookingsystem.helper.message;

public class ValidationMessage {
    private static final String ILLEGAL_STATE_EXCEPTION = "Utility class, cannot be instantiated";

    private ValidationMessage() {
        throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
    }

    public static class General {
        private General() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        public static final String PHONE_REGEX = "^[09]{2}[0-9]{9}$";
    }

    public static class AirCraft {
        private AirCraft() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CAPACITY_NOT_EMPTY = "Capacity cannot be empty";
        public static final String CAPACITY_NOT_NULL = "Capacity cannot be null";
        public static final String MANUFACTURER_NOT_EMPTY = "Manufacturer cannot be empty";
        public static final String MANUFACTURER_NOT_NULL = "Manufacturer cannot be null";
        public static final String MANUFACTURE_DATE_NOT_EMPTY = "Manufacture date cannot be empty";
        public static final String MANUFACTURE_DATE_NOT_NULL = "Manufacture date cannot be null";
        public static final String FLIGHT_SCHEDULE_ID_NOT_EMPTY = "Flight schedule id cannot be empty";
        public static final String FLIGHT_SCHEDULE_ID_NOT_NULL = "Flight schedule id cannot be null";
    }

    public static class AirFare {
        private AirFare() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROUTE_ID_NOT_EMPTY = "Route id cannot be empty";
        public static final String ROUTE_ID_NOT_NULL = "Route id cannot be null";
        public static final String FARE_NOT_EMPTY = "Fare cannot be empty";
        public static final String FARE_NOT_NULL = "Fare cannot be null";
    }

    public static class ContactDetail {
        private ContactDetail() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String EMAIL_NOT_EMPTY = "Email cannot be empty";
        public static final String EMAIL_NOT_NULL = "Email cannot be null";
        public static final String EMAIL_NOT_VALID = "Email is not valid";
        public static final String PHONE_NOT_EMPTY = "Phone cannot be empty";
        public static final String PHONE_NOT_NULL = "Phone cannot be null";
        public static final String PHONE_NOT_VALID = "Phone is not valid";
        public static final String STREET_NOT_EMPTY = "Street cannot be empty";
        public static final String STREET_NOT_NULL = "Street cannot be null";
        public static final String STATE_ID_NOT_EMPTY = "State id cannot be empty";
        public static final String STATE_ID_NOT_NULL = "State id cannot be null";
        public static final String PASSENGER_ID_NOT_EMPTY = "Passenger id cannot be empty";
        public static final String PASSENGER_ID_NOT_NULL = "Passenger id cannot be null";
    }

    public static class Country {
        private Country() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String NAME_NOT_EMPTY = "Name cannot be empty";
        public static final String NAME_NOT_NULL = "Name cannot be null";
    }

    public static class FlightSchedule {
        private FlightSchedule() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String FLIGHT_DATE_NOT_EMPTY = "Flight date cannot be empty";
        public static final String FLIGHT_DATE_NOT_NULL = "Flight date cannot be null";
        public static final String DEPARTURE_DATE_NOT_EMPTY = "Departure date cannot be empty";
        public static final String DEPARTURE_DATE_NOT_NULL = "Departure date cannot be null";
        public static final String ARRIVAL_DATE_NOT_EMPTY = "Arrival date cannot be empty";
        public static final String ARRIVAL_DATE_NOT_NULL = "Arrival date cannot be null";
    }

    public static class Passenger {
        private Passenger() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String FIRST_NAME_NOT_EMPTY = "First name cannot be empty";
        public static final String FIRST_NAME_NOT_NULL = "First name cannot be null";
        public static final String LAST_NAME_NOT_EMPTY = "Last name cannot be empty";
        public static final String LAST_NAME_NOT_NULL = "Last name cannot be null";
        public static final String ADDRESS_NOT_EMPTY = "Address cannot be empty";
        public static final String ADDRESS_NOT_NULL = "Address cannot be null";
        public static final String AGE_NOT_EMPTY = "Age cannot be empty";
        public static final String AGE_NOT_NULL = "Age cannot be null";
        public static final String NATIONALITY_NOT_EMPTY = "Nationality cannot be empty";
        public static final String NATIONALITY_NOT_NULL = "Nationality cannot be null";

    }

    public static class Route {
        private Route() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIRPORT_NOT_EMPTY = "Airport cannot be empty";
        public static final String AIRPORT_NOT_NULL = "Airport cannot be null";
        public static final String DESTINATION_NOT_EMPTY = "Destination cannot be empty";
        public static final String DESTINATION_NOT_NULL = "Destination cannot be null";
    }

    public static class State{
        private State() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String NAME_NOT_EMPTY = "Name cannot be empty";
        public static final String NAME_NOT_NULL = "Name cannot be null";
        public static final String COUNTRY_ID_NOT_EMPTY = "Country id cannot be empty";
        public static final String COUNTRY_ID_NOT_NULL = "Country id cannot be null";
    }

    public static class Transaction{
        private Transaction() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String BOOKING_DATE_NOT_EMPTY = "Booking date cannot be empty";
        public static final String BOOKING_DATE_NOT_NULL = "Booking date cannot be null";
        public static final String DEPARTURE_DATE_NOT_EMPTY = "Departure date cannot be empty";
        public static final String DEPARTURE_DATE_NOT_NULL = "Departure date cannot be null";
        public static final String PASSENGER_ID_NOT_EMPTY = "Passenger id cannot be empty";
        public static final String PASSENGER_ID_NOT_NULL = "Passenger id cannot be null";
        public static final String FLIGHT_SCHEDULE_ID_NOT_EMPTY = "Flight schedule id cannot be empty";
        public static final String FLIGHT_SCHEDULE_ID_NOT_NULL = "Flight schedule id cannot be null";
        public static final String TYPE_NOT_EMPTY = "Type cannot be empty";
        public static final String TYPE_NOT_NULL = "Type cannot be null";
    }
}
