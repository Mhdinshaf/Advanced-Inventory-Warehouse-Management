package edu.icet.service.impl;

import edu.icet.dto.SupplierDto;
import edu.icet.dto.TransactionDto;
import edu.icet.entity.SupplierEntity;
import edu.icet.entity.TransactionEntity;
import edu.icet.repository.TransactionRepository;
import edu.icet.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionImpl implements TransactionService {

    final ModelMapper modelMapper;
    final TransactionRepository transactionRepository;

    @Override
    public void addTransaction(TransactionDto transaction) {
        TransactionEntity transactionEntity=modelMapper.map(transaction, TransactionEntity.class);
        transactionRepository.save(transactionEntity);
    }

    @Override
    public void updateTransation(TransactionDto transaction) {
        TransactionEntity transactionEntity=modelMapper.map(transaction, TransactionEntity.class);
        transactionRepository.save(transactionEntity);

    }

    @Override
    public void deleteTransaction(Integer transactionId) {
        transactionRepository.deleteById(transactionId);

    }

    @Override
    public TransactionDto searchByID(Integer transactionId) {
        TransactionEntity transactionEntity =transactionRepository.findById(transactionId).get();
        TransactionDto transactionDto= modelMapper.map(transactionEntity,TransactionDto.class);
        return transactionDto;
    }

    @Override
    public List<TransactionDto> getAll() {
        List<TransactionEntity> transactionEntities=transactionRepository.findAll();
        ArrayList<TransactionDto> transactionDtoArrayList=new ArrayList<>();
        transactionEntities.forEach(transactionEntity -> {
            TransactionDto transactionDto=modelMapper.map(transactionEntity, TransactionDto.class);
            transactionDtoArrayList.add(transactionDto);
        });
        return  transactionDtoArrayList;
    }
}
