package com.example.banking_app.Service;

import com.example.banking_app.Dtos.TransactionDto;
import com.example.banking_app.Entity.Transaction;

public interface TransactionService {
    void  saveTransaction(TransactionDto transactionDto);

}
