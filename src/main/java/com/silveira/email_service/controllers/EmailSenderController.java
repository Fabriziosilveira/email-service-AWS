package com.silveira.email_service.controllers;

import com.silveira.email_service.core.EmailRequest;
import com.silveira.email_service.infra.aws.ses.SesEmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailSenderController {

    private final SesEmailSender sesEmailSender;

    @Autowired
    public EmailSenderController(SesEmailSender sesEmailSender) {
        this.sesEmailSender = sesEmailSender;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailRequest emailRequest) {
        try {
            sesEmailSender.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
            return "Email sent successfully.";
        } catch (Exception e) {
            return "Email sending failed.";
        }
    }
}
