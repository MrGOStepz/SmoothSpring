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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//https://mkyong.com/spring-boot/spring-rest-error-handling-example/
//http://localhost:8080/spring-mvc-basics/foos?id=abc
// @RequestParam means it is a parameter from the GET or POST request

@RestController
@RequestMapping(path = "api/v1/customer")
class ProductController {

    private static final Logger logger = LogManager.getLogger(ProductController.class);

    private final CustomerService customerService;

    public ProductController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public ResponseEntity<List<Customer>> getAllCustomer() {
        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        Customer customer = customerService.getAllCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping(path = "/")
    @ResponseBody
    public ResponseEntity<List<Customer>> getCustomerById(@RequestParam String columnName, @RequestParam String value) {
        List<Customer> customerList = customerService.getCustomerByColumn(columnName, value);
        return new ResponseEntity<>(customerList, HttpStatus.OK);

    }

    @GetMapping(path = "/phone/{phone}")
    @ResponseBody
    public ResponseEntity<Customer> getCustomerByPassword(@PathVariable String phone) {

        Customer customer = customerService.getCustomerByPhone(phone);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    @ResponseBody
    public ResponseEntity<String> addNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
        return new ResponseEntity<>(String.format("Add new customer successfully: %s", customer.toString()), HttpStatus.CREATED);
    }

    @PutMapping(path = "/update")
    public String updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return String.format("Update Customer: %s completed.", customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return String.format("Delete Customer Id: %d completed.", id);
    }
}
