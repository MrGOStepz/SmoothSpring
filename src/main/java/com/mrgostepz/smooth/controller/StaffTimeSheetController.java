package com.mrgostepz.smooth.controller;

import com.mrgostepz.smooth.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://mkyong.com/spring-boot/spring-rest-error-handling-example/
//http://localhost:8080/spring-mvc-basics/foos?id=abc
// @RequestParam means it is a parameter from the GET or POST request

@RestController
@RequestMapping(path = "api/v1/customer")
class StaffTimeSheetController {

    private static final Logger logger = LogManager.getLogger(StaffTimeSheetController.class);

    private final CustomerService customerService;

    public StaffTimeSheetController(CustomerService customerService) {
        this.customerService = customerService;
    }


}
