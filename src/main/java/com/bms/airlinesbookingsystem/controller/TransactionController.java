package com.bms.airlinesbookingsystem.controller;

import com.bms.airlinesbookingsystem.dto.TransactionDto;
import com.bms.airlinesbookingsystem.dto.request.CreateTransactionRequest;
import com.bms.airlinesbookingsystem.helper.message.ControllerLogMessage;
import com.bms.airlinesbookingsystem.service.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transaction")
@Slf4j
@Tag(name = "Transaction Controller", description = "Transaction Controller API")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Operation(summary = "Create Transaction",
            description = "Create Transaction",
            tags = {"Transaction Controller"})
    @PostMapping
    public ResponseEntity<Void> createTransaction(@RequestBody @Valid CreateTransactionRequest request) {
        transactionService.createTransaction(request);

        log.info(ControllerLogMessage.Transaction.TRANSACTION_CREATED);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Transaction",
            description = "Update Transaction by Transaction Id",
            tags = {"Transaction Controller"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTransaction(@PathVariable String id,
                                                  @RequestBody @Valid CreateTransactionRequest request) {
        transactionService.updateTransaction(id, request);

        log.info(ControllerLogMessage.Transaction.TRANSACTION_UPDATED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Transaction",
            description = "Delete Transaction by Transaction Id",
            tags = {"Transaction Controller"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable String id) {
        transactionService.deleteTransaction(id);

        log.info(ControllerLogMessage.Transaction.TRANSACTION_DELETED + id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Transaction",
            description = "Get Transaction by Transaction Id",
            tags = {"Transaction Controller"})
    @GetMapping("/{id}")
    public ResponseEntity<TransactionDto> findTransactionById(@PathVariable String id) {
        TransactionDto transactionDto = transactionService.findTransactionById(id);

        log.info(ControllerLogMessage.Transaction.TRANSACTION_FOUND + id);
        return ResponseEntity.ok(transactionDto);
    }

    @Operation(summary = "Get All Transactions",
            description = "Get All Transactions",
            tags = {"Transaction Controller"})
    @GetMapping
    public ResponseEntity<List<TransactionDto>> findAllTransaction() {
        List<TransactionDto> transactionDtoList = transactionService.findAllTransactions();

        log.info(ControllerLogMessage.Transaction.TRANSACTION_LISTED);
        return ResponseEntity.ok(transactionDtoList);
    }
}
