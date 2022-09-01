package com.example.testsoap;

import com.dataaccess.webservicesserver.NumberToWordsResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@SpringBootApplication
public class TestSoapApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TestSoapApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(NumberClient numberClient) {
		return args -> {
			//retrieve the word format of the number
			NumberToWordsResponse response = numberClient.getWords("3454");

			//print to screen
			System.out.println("Response is: " + response.getNumberToWordsResult());
		};
	}


}
