CREATE TABLE air_craft
(
    id                 VARCHAR(255) NOT NULL,
    number             VARCHAR(32)  NOT NULL,
    capacity           INTEGER      NOT NULL,
    manufacturer       VARCHAR(128) NOT NULL,
    manufacture_date   date         NOT NULL,
    flight_schedule_id VARCHAR(255) NOT NULL,
    CONSTRAINT "pk_aırcraft" PRIMARY KEY (id)
);

CREATE TABLE air_fare
(
    id       VARCHAR(255)     NOT NULL,
    route_id VARCHAR(255)     NOT NULL,
    fare     DOUBLE PRECISION NOT NULL,
    CONSTRAINT "pk_aırfare" PRIMARY KEY (id)
);

CREATE TABLE contact_detail
(
    id           VARCHAR(255) NOT NULL,
    email        VARCHAR(32)  NOT NULL,
    phone        VARCHAR(16)  NOT NULL,
    street       VARCHAR(64)  NOT NULL,
    state_id     VARCHAR(255) NOT NULL,
    passenger_id VARCHAR(255) NOT NULL,
    CONSTRAINT "pk_contactdetaıl" PRIMARY KEY (id)
);

CREATE TABLE country
(
    id   VARCHAR(255) NOT NULL,
    name VARCHAR(32)  NOT NULL,
    CONSTRAINT pk_country PRIMARY KEY (id)
);

CREATE TABLE flight_schedule
(
    id          VARCHAR(255) NOT NULL,
    flight_date date         NOT NULL,
    departure   date         NOT NULL,
    arrival     date         NOT NULL,
    CONSTRAINT "pk_flıghtschedule" PRIMARY KEY (id)
);

CREATE TABLE passenger
(
    id          VARCHAR(255) NOT NULL,
    first_name  VARCHAR(32)  NOT NULL,
    last_name   VARCHAR(32)  NOT NULL,
    address     VARCHAR(64)  NOT NULL,
    age         INTEGER      NOT NULL,
    nationality VARCHAR(16)  NOT NULL,
    CONSTRAINT pk_passenger PRIMARY KEY (id)
);

CREATE TABLE route
(
    id          VARCHAR(255) NOT NULL,
    airport     VARCHAR(32)  NOT NULL,
    destination VARCHAR(32)  NOT NULL,
    route_code  VARCHAR(255) NOT NULL,
    CONSTRAINT pk_route PRIMARY KEY (id)
);

CREATE TABLE state
(
    id         VARCHAR(255) NOT NULL,
    name       VARCHAR(32)  NOT NULL,
    country_id VARCHAR(255) NOT NULL,
    CONSTRAINT pk_state PRIMARY KEY (id)
);

CREATE TABLE transaction
(
    id                 VARCHAR(255) NOT NULL,
    booking_date       date         NOT NULL,
    departure_date     date         NOT NULL,
    passenger_id       VARCHAR(255) NOT NULL,
    flight_schedule_id VARCHAR(255) NOT NULL,
    type               VARCHAR(16)  NOT NULL,
    CONSTRAINT "pk_transactıon" PRIMARY KEY (id)
);

ALTER TABLE route
    ADD CONSTRAINT uc_route_routecode UNIQUE (route_code);

ALTER TABLE air_craft
    ADD CONSTRAINT FK_AIRCRAFT_ON_FLIGHT_SCHEDULE_ID FOREIGN KEY (flight_schedule_id) REFERENCES flight_schedule (id);

ALTER TABLE air_fare
    ADD CONSTRAINT FK_AIRFARE_ON_ROUTE_ID FOREIGN KEY (route_id) REFERENCES route (id);

ALTER TABLE contact_detail
    ADD CONSTRAINT FK_CONTACTDETAIL_ON_PASSENGER_ID FOREIGN KEY (passenger_id) REFERENCES passenger (id);

ALTER TABLE contact_detail
    ADD CONSTRAINT FK_CONTACTDETAIL_ON_STATE_ID FOREIGN KEY (state_id) REFERENCES state (id);

ALTER TABLE state
    ADD CONSTRAINT FK_STATE_ON_COUNTRY_ID FOREIGN KEY (country_id) REFERENCES country (id);

ALTER TABLE transaction
    ADD CONSTRAINT FK_TRANSACTION_ON_FLIGHT_SCHEDULE_ID FOREIGN KEY (flight_schedule_id) REFERENCES flight_schedule (id);

ALTER TABLE transaction
    ADD CONSTRAINT FK_TRANSACTION_ON_PASSENGER_ID FOREIGN KEY (passenger_id) REFERENCES passenger (id);