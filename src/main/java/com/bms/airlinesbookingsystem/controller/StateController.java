package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.StateDto;
import com.bms.airlinesbookingsystem.dto.request.CreateStateRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateStateRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.StateService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/state")
@Slf4j
@Tag(name = "State Controller", description = "State Controller API")
public class StateController {
    private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @Operation(summary = "Create State",
            description = "Create State",
            tags = {"State Controller"})
    @PostMapping
    public ResponseEntity<Void> createState(@RequestBody @Valid CreateStateRequest request){
        stateService.createState(request);

        log.info(ControllerLogMessage.State.STATE_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update State",
            description = "Update State by State Id",
            tags = {"State Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateState(@PathVariable String id,
                                            @RequestBody @Valid UpdateStateRequest request){
        stateService.updateState(id, request);

        log.info(ControllerLogMessage.State.STATE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update State Name",
            description = "Update State Name by State Id",
            tags = {"State Controller"})
    @PatchMapping("/{id}/name")
    public ResponseEntity<Void> updateName(@PathVariable String id,
                                           @RequestParam @Valid String name){
        stateService.updateName(id, name);

        log.info(ControllerLogMessage.State.STATE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update State Country",
            description = "Update State Country by State Id",
            tags = {"State Controller"})
    @PatchMapping("/{id}/country")
    public ResponseEntity<Void> updateCountry(@PathVariable String id,
                                              @RequestParam @Valid String countryId){
        stateService.updateCountry(id, countryId);

        log.info(ControllerLogMessage.State.STATE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete State",
            description = "Delete State by State Id",
            tags = {"State Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteState(@PathVariable String id){
        stateService.deleteState(id);

        log.info(ControllerLogMessage.State.STATE_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get State",
            description = "Get State by State Id",
            tags = {"State Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<StateDto> findStateById(@PathVariable String id){
        StateDto state = stateService.findStateById(id);

        log.info(ControllerLogMessage.State.STATE_FOUND + id);
        return ResponseEntity.ok(state);
    }

    @Operation(summary = "Get All States",
            description = "Get All States",
            tags = {"State Controller"})
    @GetMapping
    public ResponseEntity<List<StateDto>> findAllStates(){
        List<StateDto> stateList = stateService.findAllStates();

        log.info(ControllerLogMessage.State.STATE_LISTED);
        return ResponseEntity.ok(stateList);
    }
}
