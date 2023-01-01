package com.bms.airlinesbookingsystem.helper.message;

public class BusinessMessage {
    private static final String ILLEGAL_STATE_EXCEPTION = "Utility class, cannot be instantiated";

    private BusinessMessage() {
        throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
    }

    public static class AirCraft {
        private AirCraft() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIRCRAFT_SAVE_SUCCESS = "Aircraft saved successfully";
        public static final String AIRCRAFT_UPDATE_SUCCESS = "Aircraft updated successfully";
        public static final String AIRCRAFT_DELETE_SUCCESS = "Aircraft deleted successfully";
        public static final String AIRCRAFT_LISTED_SUCCESS = "Aircraft listed successfully";
        public static final String AIRCRAFT_NOT_FOUND = "Aircraft not found";
        public static final String AIRCRAFT_ALREADY_EXIST = "Aircraft already exist";
        public static final String AIRCRAFT_LIST_EMPTY = "Aircraft list is empty";
    }

    public static class AirFare {
        private AirFare() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIRFARE_SAVE_SUCCESS = "Airfare saved successfully";
        public static final String AIRFARE_UPDATE_SUCCESS = "Airfare updated successfully";
        public static final String AIRFARE_DELETE_SUCCESS = "Airfare deleted successfully";
        public static final String AIRFARE_LISTED_SUCCESS = "Airfare listed successfully";
        public static final String AIRFARE_NOT_FOUND = "Airfare not found";
        public static final String AIRFARE_ALREADY_EXIST = "Airfare already exist";
        public static final String AIRFARE_LIST_EMPTY = "Airfare list is empty";
    }

    public static class ContactDetail {


        private ContactDetail() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CONTACT_DETAIL_SAVE_SUCCESS = "Contact detail saved successfully";
        public static final String CONTACT_DETAIL_UPDATE_SUCCESS = "Contact detail updated successfully";
        public static final String CONTACT_DETAIL_DELETE_SUCCESS = "Contact detail deleted successfully";
        public static final String CONTACT_DETAIL_LISTED_SUCCESS = "Contact detail listed successfully";
        public static final String CONTACT_DETAIL_NOT_FOUND = "Contact detail not found";
        public static final String CONTACT_DETAIL_ALREADY_EXIST = "Contact detail already exist";
        public static final String CONTACT_DETAIL_LIST_EMPTY = "Contact detail list is empty";
        public static final String EMAIL_ALREADY_EXISTS = "Email already exists";
        public static final String PHONE_ALREADY_EXISTS = "Phone already exists.";
    }

    public static class Country {
        private Country() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String COUNTRY_SAVE_SUCCESS = "Country saved successfully";
        public static final String COUNTRY_UPDATE_SUCCESS = "Country updated successfully";
        public static final String COUNTRY_DELETE_SUCCESS = "Country deleted successfully";
        public static final String COUNTRY_LISTED_SUCCESS = "Country listed successfully";
        public static final String COUNTRY_NOT_FOUND = "Country not found";
        public static final String COUNTRY_ALREADY_EXIST = "Country already exist";
        public static final String COUNTRY_LIST_EMPTY = "Country list is empty";
    }

    public static class FlightSchedule {
        private FlightSchedule() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String FLIGHT_SCHEDULE_SAVE_SUCCESS = "Flight schedule saved successfully";
        public static final String FLIGHT_SCHEDULE_UPDATE_SUCCESS = "Flight schedule updated successfully";
        public static final String FLIGHT_SCHEDULE_DELETE_SUCCESS = "Flight schedule deleted successfully";
        public static final String FLIGHT_SCHEDULE_LISTED_SUCCESS = "Flight schedule listed successfully";
        public static final String FLIGHT_SCHEDULE_NOT_FOUND = "Flight schedule not found";
        public static final String FLIGHT_SCHEDULE_ALREADY_EXIST = "Flight schedule already exist";
        public static final String FLIGHT_SCHEDULE_LIST_EMPTY = "Flight schedule list is empty";
    }

    public static class Passenger {
        private Passenger() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PASSENGER_SAVE_SUCCESS = "Passenger saved successfully";
        public static final String PASSENGER_UPDATE_SUCCESS = "Passenger updated successfully";
        public static final String PASSENGER_DELETE_SUCCESS = "Passenger deleted successfully";
        public static final String PASSENGER_LISTED_SUCCESS = "Passenger listed successfully";
        public static final String PASSENGER_NOT_FOUND = "Passenger not found";
        public static final String PASSENGER_ALREADY_EXIST = "Passenger already exist";
        public static final String PASSENGER_LIST_EMPTY = "Passenger list is empty";
    }

    public static class Route {
        private Route() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROUTE_SAVE_SUCCESS = "Route saved successfully";
        public static final String ROUTE_UPDATE_SUCCESS = "Route updated successfully";
        public static final String ROUTE_DELETE_SUCCESS = "Route deleted successfully";
        public static final String ROUTE_LISTED_SUCCESS = "Route listed successfully";
        public static final String ROUTE_NOT_FOUND = "Route not found";
        public static final String ROUTE_ALREADY_EXIST = "Route already exist";
        public static final String ROUTE_LIST_EMPTY = "Route list is empty";
    }

    public static class State {
        private State() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATE_SAVE_SUCCESS = "State saved successfully";
        public static final String STATE_UPDATE_SUCCESS = "State updated successfully";
        public static final String STATE_DELETE_SUCCESS = "State deleted successfully";
        public static final String STATE_LISTED_SUCCESS = "State listed successfully";
        public static final String STATE_NOT_FOUND = "State not found";
        public static final String STATE_ALREADY_EXIST = "State already exist";
        public static final String STATE_LIST_EMPTY = "State list is empty";
    }

    public static class Transaction {
        private Transaction() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String TRANSACTION_SAVE_SUCCESS = "Transaction saved successfully";
        public static final String TRANSACTION_UPDATE_SUCCESS = "Transaction updated successfully";
        public static final String TRANSACTION_DELETE_SUCCESS = "Transaction deleted successfully";
        public static final String TRANSACTION_LISTED_SUCCESS = "Transaction listed successfully";
        public static final String TRANSACTION_NOT_FOUND = "Transaction not found";
        public static final String TRANSACTION_ALREADY_EXIST = "Transaction already exist";
        public static final String TRANSACTION_LIST_EMPTY = "Transaction list is empty";
    }
}
