package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.CountryDto;
import com.bms.airlinesbookingsystem.dto.request.CreateCountryRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateCountryRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.CountryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/country")
@Slf4j
@Tag(name = "Country Controller", description = "Country Controller API")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @Operation(summary = "Create Country",
            description = "Create Country",
            tags = {"Country Controller"})
    @PostMapping
    public ResponseEntity<Void> createCountry(@RequestBody @Valid CreateCountryRequest request) {
        countryService.createCountry(request);

        log.info(ControllerLogMessage.Country.COUNTRY_CREATED + request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Country",
            description = "Update Country by Country Id",
            tags = {"Country Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCountry(@PathVariable String id,
                                              @RequestBody @Valid UpdateCountryRequest request) {
        countryService.updateCountry(id, request);

        log.info(ControllerLogMessage.Country.COUNTRY_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Country",
            description = "Delete Country by Country Id",
            tags = {"Country Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable String id) {
        countryService.deleteCountry(id);

        log.info(ControllerLogMessage.Country.COUNTRY_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Country",
            description = "Get Country by Country Id",
            tags = {"Country Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<CountryDto> findCountryById(@PathVariable String id) {
        CountryDto countryDto = countryService.findCountryById(id);

        log.info(ControllerLogMessage.Country.COUNTRY_FOUND + id);
        return ResponseEntity.ok(countryDto);
    }

    @Operation(summary = "Get All Countries",
            description = "Get All Countries",
            tags = {"Country Controller"})
    @GetMapping
    public ResponseEntity<List<CountryDto>> findAllCountries() {
        List<CountryDto> countryDtoList = countryService.findAllCountries();

        log.info(ControllerLogMessage.Country.COUNTRY_LISTED);
        return ResponseEntity.ok(countryDtoList);
    }
}
