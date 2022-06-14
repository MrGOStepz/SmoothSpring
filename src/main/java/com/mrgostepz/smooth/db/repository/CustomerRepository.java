package com.mrgostepz.smooth.db.repository;

import com.mrgostepz.smooth.model.db.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> getCustomerInfoByColumn(String columnName, String value);
    Customer getCustomerInfoByPhone(String password);
}
