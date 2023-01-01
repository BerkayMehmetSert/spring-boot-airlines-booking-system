package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.ContactDetailDto;
import com.bms.airlinesbookingsystem.dto.request.CreateContactDetailRequest;
import com.bms.airlinesbookingsystem.dto.request.UpdateContactDetailRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.ContactDetailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/contact-detail")
@Slf4j
@Tag(name = "Contact Detail Controller", description = "Contact Detail Controller API")
public class ContactDetailController {
    private final ContactDetailService contactDetailService;

    public ContactDetailController(ContactDetailService contactDetailService) {
        this.contactDetailService = contactDetailService;
    }

    @Operation(summary = "Create Contact Detail",
            description = "Create Contact Detail",
            tags = {"Contact Detail Controller"})
    @PostMapping
    public ResponseEntity<Void> createContactDetail(@RequestBody @Valid CreateContactDetailRequest request) {
        contactDetailService.createContactDetail(request);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Contact Detail",
            description = "Update Contact Detail by Contact Detail Id",
            tags = {"Contact Detail Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateContactDetail(@PathVariable String id,
                                                    @RequestBody @Valid UpdateContactDetailRequest request) {
        contactDetailService.updateContactDetail(id, request);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Contact Detail Email",
            description = "Update Contact Detail Email by Contact Detail Id and Email",
            tags = {"Contact Detail Controller"})
    @PatchMapping("/{id}/email")
    public ResponseEntity<Void> updateEmail(@PathVariable String id,
                                            @RequestBody @Valid String email) {
        contactDetailService.updateEmail(id, email);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Contact Detail Phone",
            description = "Update Contact Detail Phone by Contact Detail Id and Phone",
            tags = {"Contact Detail Controller"})
    @PatchMapping("/{id}/phone")
    public ResponseEntity<Void> updatePhone(@PathVariable String id,
                                            @RequestBody @Valid String phone) {
        contactDetailService.updatePhone(id, phone);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Contact Detail Street",
            description = "Update Contact Detail Street by Contact Detail Id and Street",
            tags = {"Contact Detail Controller"})
    @PatchMapping("/{id}/street")
    public ResponseEntity<Void> updateStreet(@PathVariable String id,
                                             @RequestBody @Valid String street) {
        contactDetailService.updateStreet(id, street);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Contact Detail State",
            description = "Update Contact Detail State by Contact Detail Id and State",
            tags = {"Contact Detail Controller"})
    @PatchMapping("/{id}/state")
    public ResponseEntity<Void> updateState(@PathVariable String id,
                                            @RequestBody @Valid String stateId) {
        contactDetailService.updateState(id, stateId);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Contact Detail",
            description = "Delete Contact Detail by Contact Detail Id",
            tags = {"Contact Detail Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContactDetail(@PathVariable String id) {
        contactDetailService.deleteContactDetail(id);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Contact Detail",
            description = "Get Contact Detail by Contact Detail Id",
            tags = {"Contact Detail Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<ContactDetailDto> getContactDetail(@PathVariable String id) {
        ContactDetailDto contactDetailDto = contactDetailService.findContactDetailById(id);

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_FOUND + id);
        return ResponseEntity.ok(contactDetailDto);
    }

    @Operation(summary = "Get All Contact Detail",
            description = "Get All Contact Detail",
            tags = {"Contact Detail Controller"})
    @GetMapping
    public ResponseEntity<List<ContactDetailDto>> getAllContactDetails() {
        List<ContactDetailDto> contactDetailDtoList = contactDetailService.findAllContactDetails();

        log.info(ControllerLogMessage.ContactDetail.CONTACT_DETAIL_LISTED);
        return ResponseEntity.ok(contactDetailDtoList);
    }
}
