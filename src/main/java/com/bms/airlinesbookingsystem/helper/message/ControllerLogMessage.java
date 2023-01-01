package com.bms.airlinesbookingsystem.helper.message;

public class ControllerLogMessage {
    private static final String ILLEGAL_STATE_EXCEPTION = "Utility class, cannot be instantiated";

    private ControllerLogMessage() {
        throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
    }

    public static class AirCraft {
        private AirCraft() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIRCRAFT_CREATED = "Aircraft API :  Created successfully";
        public static final String AIRCRAFT_UPDATED = "Aircraft API : Updated successfully : {}";
        public static final String AIRCRAFT_DELETED = "Aircraft API : Deleted successfully : {}";
        public static final String AIRCRAFT_FOUND = "Aircraft API : Found successfully : {}";
        public static final String AIRCRAFT_LISTED = "Aircraft API: Listed successfully";
    }

    public static class AirFare {
        private AirFare() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String AIR_FARE_CREATED = "AirFare API : Created successfully";
        public static final String AIR_FARE_UPDATED = "AirFare API : Updated successfully : {}";
        public static final String AIR_FARE_DELETED = "AirFare API : Deleted successfully : {}";
        public static final String AIR_FARE_FOUND = "AirFare API : Found successfully : {}";
        public static final String AIR_FARE_LISTED = "AirFare API : Listed successfully";
    }

    public static class ContactDetail {
        private ContactDetail() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CONTACT_DETAIL_CREATED = "ContactDetail API : Created successfully";
        public static final String CONTACT_DETAIL_UPDATED = "ContactDetail API : Updated successfully : {}";
        public static final String CONTACT_DETAIL_DELETED = "ContactDetail API : Deleted successfully : {}";
        public static final String CONTACT_DETAIL_FOUND = "ContactDetail API : Found successfully : {}";
        public static final String CONTACT_DETAIL_LISTED = "ContactDetail API : Listed successfully";
    }

    public static class Country {
        private Country() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String COUNTRY_CREATED = "Country API : Created successfully";
        public static final String COUNTRY_UPDATED = "Country API : Updated successfully : {}";
        public static final String COUNTRY_DELETED = "Country API : Deleted successfully : {}";
        public static final String COUNTRY_FOUND = "Country API : Found successfully : {}";
        public static final String COUNTRY_LISTED = "Country API : Listed successfully";
    }

    public static class FlightSchedule {
        private FlightSchedule() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String FLIGHT_SCHEDULE_CREATED = "FlightSchedule API : Created successfully";
        public static final String FLIGHT_SCHEDULE_UPDATED = "FlightSchedule API : Updated successfully : {}";
        public static final String FLIGHT_SCHEDULE_DELETED = "FlightSchedule API : Deleted successfully : {}";
        public static final String FLIGHT_SCHEDULE_FOUND = "FlightSchedule API : Found successfully : {}";
        public static final String FLIGHT_SCHEDULE_LISTED = "FlightSchedule API : Listed successfully";
    }

    public static class Passenger {
        private Passenger() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PASSENGER_CREATED = "Passenger API : Created successfully";
        public static final String PASSENGER_UPDATED = "Passenger API : Updated successfully : {}";
        public static final String PASSENGER_DELETED = "Passenger API : Deleted successfully : {}";
        public static final String PASSENGER_FOUND = "Passenger API : Found successfully : {}";
        public static final String PASSENGER_LISTED = "Passenger API : Listed successfully";
    }

    public static class Route {
        private Route() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROUTE_CREATED = "Route API : Created successfully";
        public static final String ROUTE_UPDATED = "Route API : Updated successfully : {}";
        public static final String ROUTE_DELETED = "Route API : Deleted successfully : {}";
        public static final String ROUTE_FOUND = "Route API : Found successfully : {}";
        public static final String ROUTE_LISTED = "Route API : Listed successfully";
    }

    public static class State {
        private State() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATE_CREATED = "State API : Created successfully";
        public static final String STATE_UPDATED = "State API : Updated successfully : {}";
        public static final String STATE_DELETED = "State API : Deleted successfully : {}";
        public static final String STATE_FOUND = "State API : Found successfully : {}";
        public static final String STATE_LISTED = "State API : Listed successfully";
    }

    public static class Transaction {
        private Transaction() {
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String TRANSACTION_CREATED = "Transaction API : Created successfully";
        public static final String TRANSACTION_UPDATED = "Transaction API : Updated successfully : {}";
        public static final String TRANSACTION_DELETED = "Transaction API : Deleted successfully : {}";
        public static final String TRANSACTION_FOUND = "Transaction API : Found successfully : {}";
        public static final String TRANSACTION_LISTED = "Transaction API : Listed successfully";
    }

}
