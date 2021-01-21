package com.smooth;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SmoothApplication {

    private static final Logger logger = LogManager.getLogger(SmoothApplication.class);
    public static void main(String[] args) {
        logger.info("TEST");
        SpringApplication.run(SmoothApplication.class, args);
    }

}
