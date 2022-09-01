package com.example.testsoap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class NumberClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.dataaccess.webservicesserver");
        return marshaller;
    }

    @Bean
    public NumberClient numberClient(Jaxb2Marshaller marshaller) {
        NumberClient client = new NumberClient();
        //add marshaller to the client
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
