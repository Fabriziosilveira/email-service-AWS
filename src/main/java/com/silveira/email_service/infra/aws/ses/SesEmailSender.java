package com.silveira.email_service.infra.aws.ses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.model.*;

@Service
public class SesEmailSender {

    private final SesClient sesClient;

    @Autowired
    public SesEmailSender(SesClient sesClient) {
        this.sesClient = sesClient;
    }

    public void sendEmail(String to, String subject, String body) {
        try {
            SendEmailRequest emailRequest = SendEmailRequest.builder()
                    .destination(Destination.builder().toAddresses(to).build())
                    .message(Message.builder()
                            .subject(Content.builder().data(subject).build())
                            .body(Body.builder().text(Content.builder().data(body).build()).build())
                            .build())
                    .source("silveira6602@gmail.com.com")
                    .build();

            sesClient.sendEmail(emailRequest);
        } catch (SesException e) {
            System.err.println("Email sending failed: " + e.awsErrorDetails().errorMessage());
        }
    }
}
