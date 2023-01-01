package com.bms.airlinesbookingsystem.service;

import com.bms.airlinesbookingsystem.dto.ContactDetailDto;
import com.bms.airlinesbookingsystem.dto.converter.ContactDetailDtoConverter;
import com.bms.airlinesbookingsystem.dto.request.CreateContactDetailRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateContactDetailRequest;
import com.bms.airlinesbookingsystem.exception.ContactDetailNotFoundException;
import com.bms.airlinesbookingsystem.helper.message.BusinessLogMessage;
import com.bms.airlinesbookingsystem.helper.message.BusinessMessage;
import com.bms.airlinesbookingsystem.model.ContactDetail;
import com.bms.airlinesbookingsystem.repository.ContactDetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ContactDetailService {
    private final ContactDetailRepository contactDetailRepository;
    private final PassengerService passengerService;
    private final StateService stateService;
    private final ContactDetailDtoConverter converter;

    public ContactDetailService(ContactDetailRepository contactDetailRepository,
                                PassengerService passengerService,
                                StateService stateService,
                                ContactDetailDtoConverter converter) {
        this.contactDetailRepository = contactDetailRepository;
        this.passengerService = passengerService;
        this.stateService = stateService;
        this.converter = converter;
    }

    public void createContactDetail(CreateContactDetailRequest request) {
        ContactDetail contactDetail = new ContactDetail();

        contactDetail.setEmail(request.getEmail());
        contactDetail.setPhone(request.getPhone());
        contactDetail.setStreet(request.getStreet());
        contactDetail.setState(stateService.findStateByStateId(request.getStateId()));
        contactDetail.setPassenger(passengerService.findPassengerByPassengerId(request.getPassengerId()));

        contactDetailRepository.save(contactDetail);
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_CREATED);
    }

    public void updateContactDetail(final String id, UpdateContactDetailRequest request) {
        ContactDetail contactDetail = findContactDetailByContactDetailId(id);

        if (!contactDetail.getEmail().equals(request.getEmail())) {
            checkIfEmailExists(request.getEmail());
            contactDetail.setEmail(request.getEmail());
        }

        if (!contactDetail.getPhone().equals(request.getPhone())) {
            checkIfPhoneExists(request.getPhone());
            contactDetail.setPhone(request.getPhone());
        }

        contactDetail.setStreet(request.getStreet());
        contactDetail.setState(stateService.findStateByStateId(request.getStateId()));
        contactDetail.setPassenger(passengerService.findPassengerByPassengerId(request.getPassengerId()));

        contactDetailRepository.save(contactDetail);
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
    }

    public void updateEmail(final String id, final String email) {
        ContactDetail contactDetail = findContactDetailByContactDetailId(id);

        if (!contactDetail.getEmail().equals(email)) {
            checkIfEmailExists(email);
            contactDetail.setEmail(email);
        }

        contactDetailRepository.save(contactDetail);
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
    }

    public void updatePhone(final String id, final String phone) {
        ContactDetail contactDetail = findContactDetailByContactDetailId(id);

        if (!contactDetail.getPhone().equals(phone)) {
            checkIfPhoneExists(phone);
            contactDetail.setPhone(phone);
        }

        contactDetailRepository.save(contactDetail);
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
    }

    public void updateStreet(final String id, final String street) {
        ContactDetail contactDetail = findContactDetailByContactDetailId(id);

        contactDetail.setStreet(street);

        contactDetailRepository.save(contactDetail);
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
    }

    public void updateState(final String id, final String stateId) {
        ContactDetail contactDetail = findContactDetailByContactDetailId(id);

        contactDetail.setState(stateService.findStateByStateId(stateId));

        contactDetailRepository.save(contactDetail);
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
    }

    public void deleteContactDetail(final String id) {
        contactDetailRepository.delete(findContactDetailByContactDetailId(id));
        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_DELETED + id);
    }

    public ContactDetailDto findContactDetailById(final String id) {
        ContactDetail contactDetail = findContactDetailByContactDetailId(id);

        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_FOUND + id);
        return converter.convert(contactDetail);
    }

    public List<ContactDetailDto> findAllContactDetails() {
        List<ContactDetail> contactDetails = contactDetailRepository.findAll();

        if (contactDetails.isEmpty()) {
            log.error(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_LIST_EMPTY);
            throw new ContactDetailNotFoundException(BusinessMessage.ContactDetail.CONTACT_DETAIL_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_LISTED);
        return converter.convert(contactDetails);
    }

    private ContactDetail findContactDetailByContactDetailId(String id) {
        return contactDetailRepository.findById(id).orElseThrow(() -> {
            log.error(BusinessLogMessage.ContactDetail.CONTACT_DETAIL_NOT_FOUND + id);
            return new ContactDetailNotFoundException(BusinessMessage.ContactDetail.CONTACT_DETAIL_NOT_FOUND);
        });
    }

    private void checkIfEmailExists(final String email) {
        if (contactDetailRepository.existsByEmail(email)) {
            log.error(BusinessLogMessage.ContactDetail.EMAIL_ALREADY_EXISTS + email);
            throw new ContactDetailNotFoundException(BusinessMessage.ContactDetail.EMAIL_ALREADY_EXISTS);
        }
    }

    private void checkIfPhoneExists(final String phone) {
        if (contactDetailRepository.existsByPhone(phone)) {
            log.error(BusinessLogMessage.ContactDetail.PHONE_ALREADY_EXISTS + phone);
            throw new ContactDetailNotFoundException(BusinessMessage.ContactDetail.PHONE_ALREADY_EXISTS);
        }
    }
}
