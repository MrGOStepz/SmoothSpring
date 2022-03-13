package com.mrgostepz.smoothspring.db.repository;

import com.mrgostepz.smoothspring.model.db.Customer;
import com.mrgostepz.smoothspring.model.db.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> getCustomerInfoByColumn(String columnName, String value);
    Customer getCustomerInfoByPhone(String password);
}
