package com.example.banking_app;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Juerry Bank App",
                description = "Backend Rest APIs for Juerry Bank",
                version = "v1.0",
                contact = @Contact(
                        name = "Jeremiah Offong",
                        email = "Offongjeremiah@gmail.com",
                        url = "https://github.com/etukante98/Juerry_Bank_app"
                ),
                license = @License(
                        name = "Jeremiah Offong",
                        url = "https://github.com/etukante98/Juerry_Bank_app"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Juerry Bank App",
                url = "https://github.com/etukante98/Juerry_Bank_app"
        )
)
public class BankingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingAppApplication.class, args);
    }

}
