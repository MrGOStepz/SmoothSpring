package com.mrgostepz.smoothspring.db.rowmapper;

import com.mrgostepz.smoothspring.model.db.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mrgostepz.smoothspring.db.ColumnName.COL_ADDRESS;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_CARD;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_CUSTOMER_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_DATE_OF_BIRTH;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_EMAIL;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_FIRST_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_LAST_ACTIVE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_LAST_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PHONE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_TOTAL_ORDER;

public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setId(rs.getInt(COL_CUSTOMER_ID));
        customer.setFirstName(rs.getString(COL_FIRST_NAME));
        customer.setLastName(rs.getString(COL_LAST_NAME));
        customer.setPhone(rs.getString(COL_PHONE));
        customer.setEmail(rs.getString(COL_EMAIL));
        customer.setAddress(rs.getString(COL_ADDRESS));
        customer.setDateOfBirth(rs.getDate(COL_DATE_OF_BIRTH));
        customer.setLastActive(rs.getDate(COL_LAST_ACTIVE));
        customer.setCard(rs.getString(COL_CARD));
        customer.setTotalOrder(rs.getInt(COL_TOTAL_ORDER));
        customer.setIsActive(rs.getInt(COL_IS_ACTIVE));
        return customer;
    }
}
