package edu.icet.service;

import edu.icet.dto.SupplierDto;
import edu.icet.dto.TransactionDto;

import java.util.List;

public interface TransactionService {
    void addTransaction(TransactionDto transaction);
    void updateTransation(TransactionDto transaction);
    void deleteTransaction(Integer  transactionId);
    TransactionDto searchByID(Integer transactionId);
    List<TransactionDto> getAll();
}
