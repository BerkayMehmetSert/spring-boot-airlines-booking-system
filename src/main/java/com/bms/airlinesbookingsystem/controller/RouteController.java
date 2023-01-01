package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.RouteDto;
import com.bms.airlinesbookingsystem.dto.request.CreateRouteRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateRouteRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.RouteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/route")
@Slf4j
@Tag(name = "Route Controller", description = "Route Controller API")
public class RouteController {
    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @Operation(summary = "Create Route",
            description = "Create Route",
            tags = {"Route Controller"})
    @PostMapping
    public ResponseEntity<Void> createRoute(@RequestBody @Valid CreateRouteRequest request) {
        routeService.createRoute(request);

        log.info(ControllerLogMessage.Route.ROUTE_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Route",
            description = "Update Route by Route Id",
            tags = {"Route Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateRoute(@PathVariable String id,
                                            @RequestBody @Valid UpdateRouteRequest request) {
        routeService.updateRoute(id, request);

        log.info(ControllerLogMessage.Route.ROUTE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Route Airport",
            description = "Update Route Airport by Route Id",
            tags = {"Route Controller"})
    @PutMapping("/{id}/airport")
    public ResponseEntity<Void> updateAirport(@PathVariable String id,
                                              @RequestParam @Valid String airport) {
        routeService.updateAirport(id, airport);

        log.info(ControllerLogMessage.Route.ROUTE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Route Destination",
            description = "Update Route Destination by Route Id",
            tags = {"Route Controller"})
    @PutMapping("/{id}/destination")
    public ResponseEntity<Void> updateDestination(@PathVariable String id,
                                                  @RequestParam @Valid String destination) {
        routeService.updateDestination(id, destination);

        log.info(ControllerLogMessage.Route.ROUTE_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Route",
            description = "Delete Route by Route Id",
            tags = {"Route Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoute(@PathVariable String id) {
        routeService.deleteRoute(id);

        log.info(ControllerLogMessage.Route.ROUTE_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Route",
            description = "Get Route by Route Id",
            tags = {"Route Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<RouteDto> getRoute(@PathVariable String id) {
        RouteDto route = routeService.findRouteById(id);

        log.info(ControllerLogMessage.Route.ROUTE_FOUND + id);
        return ResponseEntity.ok(route);
    }

    @Operation(summary = "Get All Routes",
            description = "Get All Routes",
            tags = {"Route Controller"})
    @GetMapping
    public ResponseEntity<List<RouteDto>> getAllRoutes() {
        List<RouteDto> routeList = routeService.findAllRoutes();

        log.info(ControllerLogMessage.Route.ROUTE_LISTED);
        return ResponseEntity.ok(routeList);
    }
}
