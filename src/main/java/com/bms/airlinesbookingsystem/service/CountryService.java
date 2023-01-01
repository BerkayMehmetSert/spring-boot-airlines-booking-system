package com.bms.airlinesbookingsystem.service;

import com.bms.airlinesbookingsystem.dto.CountryDto;
import com.bms.airlinesbookingsystem.dto.converter.CountryDtoConverter;
import com.bms.airlinesbookingsystem.dto.request.CreateCountryRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateCountryRequest;
import com.bms.airlinesbookingsystem.exception.CountryAlreadyExistException;
import com.bms.airlinesbookingsystem.exception.CountryNotFoundException;
import com.bms.airlinesbookingsystem.helper.message.BusinessMessage;
import com.bms.airlinesbookingsystem.repository.CountryRepository;
import com.bms.airlinesbookingsystem.helper.message.BusinessLogMessage;
import com.bms.airlinesbookingsystem.model.Country;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryDtoConverter converter;

    public CountryService(CountryRepository countryRepository,
                          CountryDtoConverter converter) {
        this.countryRepository = countryRepository;
        this.converter = converter;
    }

    public void createCountry(CreateCountryRequest request) {
        checkIfCountryExists(request.getName());

        Country country = new Country();

        country.setName(request.getName());

        countryRepository.save(country);
        log.info(BusinessLogMessage.Country.COUNTRY_CREATED);
    }

    public void updateCountry(final String id, UpdateCountryRequest request) {
        Country country = findCountryByCountryId(id);

        country.setName(request.getName());

        countryRepository.save(country);
        log.info(BusinessLogMessage.Country.COUNTRY_UPDATED + id);
    }

    public void deleteCountry(final String id) {
        countryRepository.delete(findCountryByCountryId(id));
        log.info(BusinessLogMessage.Country.COUNTRY_DELETED + id);
    }

    public CountryDto findCountryById(final String id) {
        Country country = findCountryByCountryId(id);

        log.info(BusinessLogMessage.Country.COUNTRY_FOUND + id);
        return converter.convert(country);
    }

    public List<CountryDto> findAllCountries() {
        List<Country> countries = countryRepository.findAll();

        if (countries.isEmpty()) {
            log.info(BusinessLogMessage.Country.COUNTRY_LIST_EMPTY);
            throw new CountryNotFoundException(BusinessMessage.Country.COUNTRY_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.Country.COUNTRY_LISTED);
        return converter.convert(countries);
    }

    private void checkIfCountryExists(String name) {
        if (countryRepository.existsByNameIgnoreCase(name)) {
            log.error(BusinessLogMessage.Country.COUNTRY_ALREADY_EXISTS + name);
            throw new CountryAlreadyExistException(BusinessMessage.Country.COUNTRY_ALREADY_EXIST);
        }
    }

    protected Country findCountryByCountryId(final String id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> {
                    log.error(BusinessLogMessage.Country.COUNTRY_NOT_FOUND + id);
                    return new CountryNotFoundException(BusinessMessage.Country.COUNTRY_NOT_FOUND);
                });
    }
}
