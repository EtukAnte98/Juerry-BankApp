package com.example.banking_app.Service;

import com.example.banking_app.Dtos.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
