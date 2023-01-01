package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.PassengerDto;
import com.bms.airlinesbookingsystem.dto.request.CreatePassengerRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdatePassengerRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.PassengerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/passenger")
@Slf4j
@Tag(name = "Passenger Controller", description = "Passenger Controller API")
public class PassengerController {
    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @Operation(summary = "Create Passenger",
            description = "Create Passenger",
            tags = {"Passenger Controller"})
    @PostMapping
    public ResponseEntity<Void> createPassenger(@RequestBody @Valid CreatePassengerRequest request) {
        passengerService.createPassenger(request);

        log.info(ControllerLogMessage.Passenger.PASSENGER_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Passenger",
            description = "Update Passenger by Passenger Id",
            tags = {"Passenger Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePassenger(@PathVariable String id,
                                                @RequestBody @Valid UpdatePassengerRequest request) {
        passengerService.updatePassenger(id, request);

        log.info(ControllerLogMessage.Passenger.PASSENGER_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Passenger First Name",
            description = "Update Passenger First Name by Passenger Id",
            tags = {"Passenger Controller"})
    @PatchMapping("/{id}/firstName")
    public ResponseEntity<Void> updatePassengerFirstName(@PathVariable String id,
                                                         @RequestParam @Valid String firstName) {
        passengerService.updateFirstName(id, firstName);

        log.info(ControllerLogMessage.Passenger.PASSENGER_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Passenger Last Name",
            description = "Update Passenger Last Name by Passenger Id",
            tags = {"Passenger Controller"})
    @PatchMapping("/{id}/lastName")
    public ResponseEntity<Void> updatePassengerLastName(@PathVariable String id,
                                                        @RequestParam @Valid String lastName) {
        passengerService.updateLastName(id, lastName);

        log.info(ControllerLogMessage.Passenger.PASSENGER_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Passenger Address",
            description = "Update Passenger Address by Passenger Id",
            tags = {"Passenger Controller"})
    @PatchMapping("/{id}/address")
    public ResponseEntity<Void> updatePassengerAddress(@PathVariable String id,
                                                       @RequestParam @Valid String address) {
        passengerService.updateAddress(id, address);

        log.info(ControllerLogMessage.Passenger.PASSENGER_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Passenger Age",
            description = "Update Passenger Age by Passenger Id",
            tags = {"Passenger Controller"})
    @PatchMapping("/{id}/age")
    public ResponseEntity<Void> updatePassengerAge(@PathVariable String id,
                                                   @RequestParam @Valid int age) {
        passengerService.updateAge(id, age);

        log.info(ControllerLogMessage.Passenger.PASSENGER_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Passenger Nationality",
            description = "Update Passenger Nationality by Passenger Id",
            tags = {"Passenger Controller"})
    @PatchMapping("/{id}/nationality")
    public ResponseEntity<Void> updatePassengerNationality(@PathVariable String id,
                                                           @RequestParam @Valid String nationality) {
        passengerService.updateNationality(id, nationality);

        log.info(ControllerLogMessage.Passenger.PASSENGER_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Passenger",
            description = "Delete Passenger by Passenger Id",
            tags = {"Passenger Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePassenger(@PathVariable String id) {
        passengerService.deletePassenger(id);

        log.info(ControllerLogMessage.Passenger.PASSENGER_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Passenger",
            description = "Get Passenger by Passenger Id",
            tags = {"Passenger Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<PassengerDto> findPassengerById(@PathVariable String id) {
        PassengerDto passengerDto = passengerService.findPassengerById(id);

        log.info(ControllerLogMessage.Passenger.PASSENGER_FOUND + id);
        return ResponseEntity.ok(passengerDto);
    }

    @Operation(summary = "Get All Passenger",
            description = "Get All Passenger",
            tags = {"Passenger Controller"})
    @GetMapping
    public ResponseEntity<List<PassengerDto>> findAllPassengers() {
        List<PassengerDto> passengerDtoList = passengerService.findAllPassengers();

        log.info(ControllerLogMessage.Passenger.PASSENGER_LISTED);
        return ResponseEntity.ok(passengerDtoList);
    }
}
