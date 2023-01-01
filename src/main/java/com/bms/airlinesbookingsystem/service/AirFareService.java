package com.bms.airlinesbookingsystem.service;

import com.bms.airlinesbookingsystem.dto.AirFareDto;
import com.bms.airlinesbookingsystem.dto.converter.AirFareDtoConverter;
import com.bms.airlinesbookingsystem.dto.request.CreateAirFareRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateAirFareRequest;
import com.bms.airlinesbookingsystem.exception.AirFareNotFoundException;
import com.bms.airlinesbookingsystem.helper.message.BusinessLogMessage;
import com.bms.airlinesbookingsystem.helper.message.BusinessMessage;
import com.bms.airlinesbookingsystem.model.AirFare;
import com.bms.airlinesbookingsystem.repository.AirFareRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AirFareService {
    private final AirFareRepository airFareRepository;
    private final RouteService routeService;
    private final AirFareDtoConverter converter;

    public AirFareService(AirFareRepository airFareRepository,
                          RouteService routeService,
                          AirFareDtoConverter converter) {
        this.airFareRepository = airFareRepository;
        this.routeService = routeService;
        this.converter = converter;
    }

    public void createAirFare(CreateAirFareRequest request) {
        AirFare airFare = new AirFare();

        airFare.setFare(request.getFare());
        airFare.setRoute(routeService.findRouteByRouteId(request.getRouteId()));

        airFareRepository.save(airFare);
        log.info(BusinessLogMessage.AirFare.AIR_FARE_CREATED);
    }

    public void updateAirFare(final String id, UpdateAirFareRequest request) {
        AirFare airFare = findAirFareByAirFareId(id);

        airFare.setFare(request.getFare());
        airFare.setRoute(routeService.findRouteByRouteId(request.getRouteId()));

        airFareRepository.save(airFare);
        log.info(BusinessLogMessage.AirFare.AIR_FARE_UPDATED + id);
    }

    public void updateFare(final String id, final Double fare) {
        AirFare airFare = findAirFareByAirFareId(id);

        airFare.setFare(fare);

        airFareRepository.save(airFare);
        log.info(BusinessLogMessage.AirFare.AIR_FARE_UPDATED + id);
    }

    public void deleteAirFare(final String id) {
        airFareRepository.delete(findAirFareByAirFareId(id));
        log.info(BusinessLogMessage.AirFare.AIR_FARE_DELETED + id);
    }

    public AirFareDto findAirFareById(final String id) {
        AirFare airFare = findAirFareByAirFareId(id);

        log.info(BusinessLogMessage.AirFare.AIR_FARE_FOUND + id);
        return converter.convert(airFare);
    }

    public List<AirFareDto> findAllAirFares() {
        List<AirFare> airFareList = airFareRepository.findAll();

        if (airFareList.isEmpty()) {
            log.info(BusinessLogMessage.AirFare.AIR_FARE_LIST_EMPTY);
            throw new AirFareNotFoundException(BusinessMessage.AirFare.AIRFARE_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.AirFare.AIR_FARE_LISTED);
        return converter.convert(airFareList);
    }

    private AirFare findAirFareByAirFareId(final String id) {
        return airFareRepository.findById(id)
                .orElseThrow(() -> {
                    log.info(BusinessLogMessage.AirFare.AIR_FARE_NOT_FOUND + id);
                    throw new AirFareNotFoundException(BusinessMessage.AirFare.AIRFARE_NOT_FOUND);
                });
    }
}

