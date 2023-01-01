package com.bms.airlinesbookingsystem.helper.message;

public class BusinessLogMessage {
    private static final String ILLEGAL_STATE_EXCEPTION = "Utility class, cannot be instantiated";

    private BusinessLogMessage() {
        throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
    }

    public static class AirCraft {
        private AirCraft() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIRCRAFT_NOT_FOUND = "Aircraft not found : {}";
        public static final String AIR_CRAFT_ALREADY_EXISTS = "Aircraft already exists : {}";
        public static final String AIR_CRAFT_CREATED = "AirCraft created successfully";
        public static final String AIR_CRAFT_UPDATED = "AirCraft updated successfully : {}";
        public static final String AIR_CRAFT_DELETED = "AirCraft deleted successfully : {}";
        public static final String AIR_CRAFT_LISTED = "AirCraft listed successfully";
        public static final String AIR_CRAFT_FOUND = "AirCraft found successfully : {}";
        public static final String AIR_CRAFT_LIST_EMPTY = "AirCraft list is empty";
    }

    public static class AirFare {
        private AirFare() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIR_FARE_NOT_FOUND = "AirFare not found : {}";
        public static final String AIR_FARE_ALREADY_EXISTS = "AirFare already exists : {}";
        public static final String AIR_FARE_CREATED = "AirFare created successfully";
        public static final String AIR_FARE_UPDATED = "AirFare updated successfully : {}";
        public static final String AIR_FARE_DELETED = "AirFare deleted successfully : {}";
        public static final String AIR_FARE_LISTED = "AirFare listed successfully";
        public static final String AIR_FARE_FOUND = "AirFare found successfully : {}";
        public static final String AIR_FARE_LIST_EMPTY = "AirFare list is empty";
    }

    public static class ContactDetail {


        private ContactDetail() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CONTACT_DETAIL_NOT_FOUND = "ContactDetail not found : {}";
        public static final String CONTACT_DETAIL_ALREADY_EXISTS = "ContactDetail already exists : {}";
        public static final String CONTACT_DETAIL_CREATED = "ContactDetail created successfully";
        public static final String CONTACT_DETAIL_UPDATED = "ContactDetail updated successfully : {}";
        public static final String CONTACT_DETAIL_DELETED = "ContactDetail deleted successfully : {}";
        public static final String CONTACT_DETAIL_LISTED = "ContactDetail listed successfully";
        public static final String CONTACT_DETAIL_FOUND = "ContactDetail found successfully : {}";
        public static final String CONTACT_DETAIL_LIST_EMPTY = "ContactDetail list is empty";
        public static final String EMAIL_ALREADY_EXISTS = "Email already exists : {}";
        public static final String PHONE_ALREADY_EXISTS = "Phone already exists : {}";
    }

    public static class Country {
        private Country() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String COUNTRY_NOT_FOUND = "Country not found : {}";
        public static final String COUNTRY_ALREADY_EXISTS = "Country already exists : {}";
        public static final String COUNTRY_CREATED = "Country created successfully";
        public static final String COUNTRY_UPDATED = "Country updated successfully : {}";
        public static final String COUNTRY_DELETED = "Country deleted successfully : {}";
        public static final String COUNTRY_LISTED = "Country listed successfully";
        public static final String COUNTRY_FOUND = "Country found successfully : {}";
        public static final String COUNTRY_LIST_EMPTY = "Country list is empty";
    }

    public static class FlightSchedule {
        private FlightSchedule() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String FLIGHT_SCHEDULE_NOT_FOUND = "FlightSchedule not found : {}";
        public static final String FLIGHT_SCHEDULE_ALREADY_EXISTS = "FlightSchedule already exists : {}";
        public static final String FLIGHT_SCHEDULE_CREATED = "FlightSchedule created successfully";
        public static final String FLIGHT_SCHEDULE_UPDATED = "FlightSchedule updated successfully : {}";
        public static final String FLIGHT_SCHEDULE_DELETED = "FlightSchedule deleted successfully : {}";
        public static final String FLIGHT_SCHEDULE_LISTED = "FlightSchedule listed successfully";
        public static final String FLIGHT_SCHEDULE_FOUND = "FlightSchedule found successfully : {}";
        public static final String FLIGHT_SCHEDULE_LIST_EMPTY = "FlightSchedule list is empty";
    }

    public static class Passenger {
        private Passenger() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PASSENGER_NOT_FOUND = "Passenger not found : {}";
        public static final String PASSENGER_ALREADY_EXISTS = "Passenger already exists : {}";
        public static final String PASSENGER_CREATED = "Passenger created successfully";
        public static final String PASSENGER_UPDATED = "Passenger updated successfully : {}";
        public static final String PASSENGER_DELETED = "Passenger deleted successfully : {}";
        public static final String PASSENGER_LISTED = "Passenger listed successfully";
        public static final String PASSENGER_FOUND = "Passenger found successfully : {}";
        public static final String PASSENGER_LIST_EMPTY = "Passenger list is empty";
    }

    public static class Route {
        private Route() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROUTE_NOT_FOUND = "Route not found : {}";
        public static final String ROUTE_ALREADY_EXISTS = "Route already exists : {}";
        public static final String ROUTE_CREATED = "Route created successfully";
        public static final String ROUTE_UPDATED = "Route updated successfully : {}";
        public static final String ROUTE_DELETED = "Route deleted successfully : {}";
        public static final String ROUTE_LISTED = "Route listed successfully";
        public static final String ROUTE_FOUND = "Route found successfully : {}";
        public static final String ROUTE_LIST_EMPTY = "Route list is empty";
    }

    public static class State {
        private State() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATE_NOT_FOUND = "State not found : {}";
        public static final String STATE_ALREADY_EXISTS = "State already exists : {}";
        public static final String STATE_CREATED = "State created successfully";
        public static final String STATE_UPDATED = "State updated successfully : {}";
        public static final String STATE_DELETED = "State deleted successfully : {}";
        public static final String STATE_LISTED = "State listed successfully";
        public static final String STATE_FOUND = "State found successfully : {}";
        public static final String STATE_LIST_EMPTY = "State list is empty";
    }

    public static class Transaction {
        private Transaction() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String TRANSACTION_NOT_FOUND = "Transaction not found : {}";
        public static final String TRANSACTION_ALREADY_EXISTS = "Transaction already exists : {}";
        public static final String TRANSACTION_CREATED = "Transaction created successfully";
        public static final String TRANSACTION_UPDATED = "Transaction updated successfully : {}";
        public static final String TRANSACTION_DELETED = "Transaction deleted successfully : {}";
        public static final String TRANSACTION_LISTED = "Transaction listed successfully";
        public static final String TRANSACTION_FOUND = "Transaction found successfully : {}";
        public static final String TRANSACTION_LIST_EMPTY = "Transaction list is empty";
    }
}
