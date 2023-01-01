package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.FlightScheduleDto;
import com.bms.airlinesbookingsystem.dto.request.CreateFlightScheduleRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateFlightScheduleRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.FlightScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/flight-schedule")
@Slf4j
@Tag(name = "Flight Schedule Controller", description = "Flight Schedule Controller API")
public class FlightScheduleController {
    private final FlightScheduleService flightScheduleService;

    public FlightScheduleController(FlightScheduleService flightScheduleService) {
        this.flightScheduleService = flightScheduleService;
    }

    @Operation(summary = "Create Flight Schedule",
            description = "Create Flight Schedule",
            tags = {"Flight Schedule Controller"})
    @PostMapping
    public ResponseEntity<Void> createFlightSchedule(@RequestBody @Valid CreateFlightScheduleRequest request) {
        flightScheduleService.createFlightSchedule(request);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Flight Schedule",
            description = "Update Flight Schedule by Flight Schedule Id",
            tags = {"Flight Schedule Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateFlightSchedule(@PathVariable String id,
                                                     @RequestBody @Valid UpdateFlightScheduleRequest request) {
        flightScheduleService.updateFlightSchedule(id, request);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Flight Schedule Flight Date",
            description = "Update Flight Schedule Flight Date by Flight Schedule Id and Flight Date",
            tags = {"Flight Schedule Controller"})
    @PatchMapping("/{id}/flight-date")
    public ResponseEntity<Void> updateFlightDate(@PathVariable String id,
                                                 @RequestParam @Valid LocalDate flightDate) {
        flightScheduleService.updateFlightDate(id, flightDate);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Flight Schedule Departure",
            description = "Update Flight Schedule Departure by Flight Schedule Id and Departure",
            tags = {"Flight Schedule Controller"})
    @PatchMapping("/{id}/departure")
    public ResponseEntity<Void> updateDeparture(@PathVariable String id,
                                                @RequestParam @Valid LocalDate departure) {
        flightScheduleService.updateDeparture(id, departure);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Flight Schedule Arrival",
            description = "Update Flight Schedule Arrival by Flight Schedule Id and Arrival",
            tags = {"Flight Schedule Controller"})
    @PatchMapping("/{id}/arrival")
    public ResponseEntity<Void> updateArrival(@PathVariable String id,
                                              @RequestParam @Valid LocalDate arrival) {
        flightScheduleService.updateArrival(id, arrival);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Flight Schedule",
            description = "Delete Flight Schedule by Flight Schedule Id",
            tags = {"Flight Schedule Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlightSchedule(@PathVariable String id) {
        flightScheduleService.deleteFlightSchedule(id);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Flight Schedule",
            description = "Get Flight Schedule by Flight Schedule Id",
            tags = {"Flight Schedule Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<FlightScheduleDto> findFlightScheduleById(@PathVariable String id) {
        FlightScheduleDto flightScheduleDto = flightScheduleService.findFlightScheduleById(id);

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_FOUND + id);
        return ResponseEntity.ok(flightScheduleDto);
    }

    @Operation(summary = "Get All Flight Schedule",
            description = "Get All Flight Schedule",
            tags = {"Flight Schedule Controller"})
    @GetMapping
    public ResponseEntity<List<FlightScheduleDto>> findAllFlightSchedules() {
        List<FlightScheduleDto> flightScheduleDtoList = flightScheduleService.findAllFlightSchedules();

        log.info(ControllerLogMessage.FlightSchedule.FLIGHT_SCHEDULE_LISTED);
        return ResponseEntity.ok(flightScheduleDtoList);
    }
}
