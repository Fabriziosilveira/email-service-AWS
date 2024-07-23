package com.silveira.email_service.application;

import com.silveira.email_service.core.EmailSenderUseCase;
import com.silveira.email_service.adapters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void SendEmail(String to, String subject, String body) {
        this.emailSenderGateway.SendEmail(to,subject,body);
    }
}
