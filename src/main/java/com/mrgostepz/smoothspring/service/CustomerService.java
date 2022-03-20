package com.mrgostepz.smoothspring.service;

import com.mrgostepz.smoothspring.db.repository.CustomerRepository;
import com.mrgostepz.smoothspring.exception.RecordNotFoundException;
import com.mrgostepz.smoothspring.model.db.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private static final Logger logger = LogManager.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomer() {
        List<Customer> customerList = customerRepository.getAll();
        if (customerList == null) {
            throw new RecordNotFoundException("There is no record in customer table.");
        }
        logger.info(customerList);
        return customerRepository.getAll();
    }

    public Customer getAllCustomerById(int id) {
        Customer customer = customerRepository.getById(id);
        if (customer == null) {
            throw new RecordNotFoundException("There is no customer in this id.");
        }
        logger.info("Customer {}", customer);
        return customer;
    }

    public Customer getCustomerByPhone(String phone) {
        Customer customer = customerRepository.getCustomerInfoByPhone(phone);
        if (customer == null) {
            throw new RecordNotFoundException("There is no customer in this phone.");
        }
        logger.info("Customer {}", customer);
        return customer;
    }

    public void addNewCustomer(Customer customer) {
        int customerId = customerRepository.add(customer);
        customer.setId(customerId);
        if (customerId > 0) {
            logger.info("Add new customer Successfully: {}", customer);
        } else {
            logger.warn("Cannot add new customer: {}", customer);
            throw new RecordNotFoundException("Cannot Create");
        }
    }

    public void updateCustomer(Customer customer) {
        if (Boolean.TRUE.equals(customerRepository.update(customer))) {
            logger.info("Update customer Successfully: {}", customer);
        } else {
            logger.warn("Cannot Update customer: {}", customer);
        }

    }

    public void deleteCustomer(int id) {
        if (Boolean.TRUE.equals(customerRepository.deleteById(id))) {
            logger.info("Delete customer Successfully: {}", id);
        } else {
            logger.warn("Cannot Delete customer: {}", id);
        }
    }

    public List<Customer> getCustomerByColumn(String column, String value) {
        List<Customer> customerList = customerRepository.getCustomerInfoByColumn(column, value);
        if (customerList == null) {
            throw new RecordNotFoundException("There is no customer in this column.");
        }
        Customer customer = customerList.get(0);
        logger.info("Customer {}", customer);
        return customerList;
    }
}
