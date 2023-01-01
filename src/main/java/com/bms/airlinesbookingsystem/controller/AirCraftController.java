package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.AirCraftDto;
import com.bms.airlinesbookingsystem.dto.request.CreateAirCraftRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateAirCraftRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.AirCraftService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/aircraft")
@Slf4j
@Tag(name = "AirCraft Controller", description = "AirCraft Controller API")
public class AirCraftController {
    private final AirCraftService airCraftService;

    public AirCraftController(AirCraftService airCraftService) {
        this.airCraftService = airCraftService;
    }

    @Operation(summary = "Create AirCraft",
            description = "Create AirCraft",
            tags = {"AirCraft Controller"})
    @PostMapping
    public ResponseEntity<Void> createAirCraft(@RequestBody @Valid CreateAirCraftRequest request) {
        airCraftService.createAirCraft(request);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirCraft",
            description = "Update AirCraft by AirCraft Id",
            tags = {"AirCraft Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateAirCraft(@PathVariable String id,
                                               @RequestBody @Valid UpdateAirCraftRequest request) {
        airCraftService.updateAirCraft(id, request);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirCraft capacity",
            description = "Update AirCraft capacity by AirCraft Id and capacity",
            tags = {"AirCraft Controller"})
    @PatchMapping("/{id}/capacity")
    public ResponseEntity<Void> updateCapacity(@PathVariable String id,
                                               @RequestParam @Valid Integer capacity) {
        airCraftService.updateCapacity(id, capacity);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirCraft manufacture",
            description = "Update AirCraft manufacture by AirCraft Id and manufacture",
            tags = {"AirCraft Controller"})
    @PatchMapping("/{id}/manufacturer")
    public ResponseEntity<Void> updateManufacturer(@PathVariable String id,
                                                   @RequestParam @Valid String manufacturer) {
        airCraftService.updateManufacturer(id, manufacturer);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirCraft manufacture date",
            description = "Update AirCraft manufacture date by AirCraft Id and manufacture date",
            tags = {"AirCraft Controller"})
    @PatchMapping("/{id}/manufacture-date")
    public ResponseEntity<Void> updateManufactureDate(@PathVariable String id,
                                                      @RequestParam @Valid LocalDate manufactureDate) {
        airCraftService.updateManufactureDate(id, manufactureDate);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirCraft flight schedule",
            description = "Update AirCraft flight schedule by AirCraft Id and flight schedule",
            tags = {"AirCraft Controller"})
    @PatchMapping("/{id}/flight-schedule")
    public ResponseEntity<Void> updateFlightSchedule(@PathVariable String id,
                                                     @RequestParam @Valid String flightScheduleId) {
        airCraftService.updateFlightSchedule(id, flightScheduleId);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete AirCraft",
            description = "Delete AirCraft by AirCraft Id",
            tags = {"AirCraft Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirCraft(@PathVariable String id) {
        airCraftService.deleteAirCraft(id);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get AirCraft",
            description = "Get AirCraft by AirCraft Id",
            tags = {"AirCraft Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<AirCraftDto> findAirCraftById(@PathVariable String id) {
        AirCraftDto airCraftDto = airCraftService.findAirCraftById(id);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_FOUND + id);
        return ResponseEntity.ok(airCraftDto);
    }

    @Operation(summary = "Get AirCraft ",
            description = "Get AirCraft by AirCraft number",
            tags = {"AirCraft Controller"})
    @GetMapping("/number/{number}")
    public ResponseEntity<AirCraftDto> findAirCraftByNumber(@PathVariable String number) {
        AirCraftDto airCraftDto = airCraftService.findAirCraftByNumber(number);

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_FOUND + number);
        return ResponseEntity.ok(airCraftDto);
    }

    @Operation(summary = "Get All AirCraft",
            description = "Get All AirCraft",
            tags = {"AirCraft Controller"})
    @GetMapping
    public ResponseEntity<List<AirCraftDto>> findAllAirCrafts() {
        List<AirCraftDto> airCraftDtoList = airCraftService.findAllAirCrafts();

        log.info(ControllerLogMessage.AirCraft.AIRCRAFT_LISTED);
        return ResponseEntity.ok(airCraftDtoList);
    }
}
