package com.silveira.email_service.core;

public class EmailRequest {
    private String to;
    private String subject;
    private String body;

    // Construtor padrão
    public EmailRequest() {
    }

    // Construtor parametrizado
    public EmailRequest(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    // Getters
    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    // Setters
    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // toString para facilitar a depuração
    @Override
    public String toString() {
        return "EmailRequest{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
