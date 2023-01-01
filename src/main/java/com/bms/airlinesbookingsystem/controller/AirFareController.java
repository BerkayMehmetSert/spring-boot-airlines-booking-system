package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.AirFareDto;
import com.bms.airlinesbookingsystem.dto.request.CreateAirFareRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateAirFareRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.AirFareService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/airfare")
@Slf4j
@Tag(name = "AirFare Controller", description = "AirFare Controller API")
public class AirFareController {
    private final AirFareService airFareService;

    public AirFareController(AirFareService airFareService) {
        this.airFareService = airFareService;
    }

    @Operation(summary = "Create AirFare",
            description = "Create AirFare",
            tags = {"AirFare Controller"})
    @PostMapping
    public ResponseEntity<Void> createAirFare(@RequestBody @Valid CreateAirFareRequest request) {
        airFareService.createAirFare(request);

        log.info(ControllerLogMessage.AirFare.AIR_FARE_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirFare",
            description = "Update AirFare by AirFare Id",
            tags = {"AirFare Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateAirFare(@PathVariable String id,
                                              @RequestBody @Valid UpdateAirFareRequest request) {
        airFareService.updateAirFare(id, request);

        log.info(ControllerLogMessage.AirFare.AIR_FARE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update AirFare fare",
            description = "Update AirFare fare by AirFare Id and fare",
            tags = {"AirFare Controller"})
    @PatchMapping("/{id}/fare")
    public ResponseEntity<Void> updateFare(@PathVariable String id,
                                           @RequestParam @Valid Double fare) {
        airFareService.updateFare(id, fare);

        log.info(ControllerLogMessage.AirFare.AIR_FARE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete AirFare",
            description = "Delete AirFare by AirFare Id",
            tags = {"AirFare Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirFare(@PathVariable String id) {
        airFareService.deleteAirFare(id);

        log.info(ControllerLogMessage.AirFare.AIR_FARE_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get AirFare",
            description = "Get AirFare by AirFare Id",
            tags = {"AirFare Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<AirFareDto> findAirFareByAirFareId(@PathVariable String id) {
        AirFareDto airFareDto = airFareService.findAirFareById(id);

        log.info(ControllerLogMessage.AirFare.AIR_FARE_FOUND + id);
        return ResponseEntity.ok(airFareDto);
    }

    @Operation(summary = "Get All AirFare",
            description = "Get All AirFare",
            tags = {"AirFare Controller"})
    @GetMapping
    public ResponseEntity<List<AirFareDto>> findAllAirFares() {
        List<AirFareDto> airFareDtoList = airFareService.findAllAirFares();

        log.info(ControllerLogMessage.AirFare.AIR_FARE_LISTED);
        return ResponseEntity.ok(airFareDtoList);
    }
}
