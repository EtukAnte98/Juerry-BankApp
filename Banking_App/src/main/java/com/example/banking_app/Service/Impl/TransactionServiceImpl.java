package com.example.banking_app.Service.Impl;

import com.example.banking_app.Dtos.TransactionDto;
import com.example.banking_app.Entity.Transaction;
import com.example.banking_app.Repository.TransactionRepository;
import com.example.banking_app.Service.TransactionService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
    Transaction transaction = Transaction.builder()
            .transactionType(transactionDto.getTransactionType())
            .accountNumber(transactionDto.getAccountNumber())
            .amount(transactionDto.getAmount())
            .status("SUCCESS")
            .build();
    transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}
