package com.mrgostepz.smoothspring.controller;

import com.mrgostepz.smoothspring.model.db.Customer;
import com.mrgostepz.smoothspring.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
