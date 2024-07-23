package com.silveira.email_service.core;

public interface EmailSenderUseCase {
    void SendEmail(
            String to,
            String subject,
            String body
    );
}
