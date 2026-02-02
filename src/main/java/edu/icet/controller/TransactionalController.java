package edu.icet.controller;

import edu.icet.dto.TransactionDto;
import edu.icet.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Transactional")
@RequiredArgsConstructor
public class TransactionalController{

    final TransactionService transactionService;

    @PostMapping("/Add")
    public void addTransaction(@RequestBody TransactionDto transaction) {
        transactionService.addTransaction(transaction);

    }

    @PutMapping("/Update")
    public void updateTransation(@RequestBody TransactionDto transaction) {
        transactionService.updateTransation(transaction);
    }

    @DeleteMapping("/Delete-By-Id/{transactionId}")
    public void deleteTransaction(@PathVariable Integer transactionId) {
        transactionService.deleteTransaction(transactionId);
    }

    @GetMapping("/Search-By-Id/{transactionId}")
    public TransactionDto searchByID(@PathVariable Integer transactionId) {
        return transactionService.searchByID(transactionId);
    }

    @GetMapping("/GetAll")
    public List<TransactionDto> getAll() {
        return transactionService.getAll();
    }
}