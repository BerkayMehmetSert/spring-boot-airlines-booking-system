package com.bms.airlinesbookingsystem.repository;

import com.bms.airlinesbookingsystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}