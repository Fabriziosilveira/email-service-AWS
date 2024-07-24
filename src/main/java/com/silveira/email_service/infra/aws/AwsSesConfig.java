package com.silveira.email_service.infra.aws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.http.apache.ApacheHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.SesClientBuilder;

import java.net.URI;

@Configuration
public class AwsSesConfig {

    @Value("${cloud.aws.region.static}")
    private String region;

    @Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secretKey}")
    private String secretKey;

    @Value("${cloud.aws.ses.endpoint}")
    private String sesEndpoint;

    @Bean
    public SesClient sesClient() {
        SesClientBuilder builder = SesClient.builder()
                .region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKey, secretKey)))
                .httpClient(ApacheHttpClient.builder().build());

        if (sesEndpoint != null && !sesEndpoint.isEmpty()) {
            builder.endpointOverride(URI.create(sesEndpoint));
        }

        return builder.build();
    }
}
