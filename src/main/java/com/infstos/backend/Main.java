package com.infstos.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Główna klasa Spring Boot z adnotacją @SpringBootApplication
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

// Kontroler, który obsługuje requesty HTTP
@RestController
class TestController {

    // Definicja prostego endpointu "/test"
    @GetMapping("/test")
    public String testEndpoint(@RequestParam(defaultValue = "World") String param) {
        return "Essa, " + param;
    }
}
