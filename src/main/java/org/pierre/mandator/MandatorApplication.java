package org.pierre.mandator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MandatorApplication implements CommandLineRunner {
    @Autowired
    MandatorService mandatorService;

    public static void main(String[] args) {
        SpringApplication.run(MandatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mandatorService.saveRule();
        mandatorService.saveAnotherRule();
    }

}
