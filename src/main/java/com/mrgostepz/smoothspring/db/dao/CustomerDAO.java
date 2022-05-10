package com.mrgostepz.smoothspring.db.dao;

import com.mrgostepz.smoothspring.db.repository.CustomerRepository;
import com.mrgostepz.smoothspring.db.rowmapper.CustomerRowMapper;
import com.mrgostepz.smoothspring.model.db.Customer;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_ADD_CUSTOMER;
import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_DELETE_CUSTOMER;
import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_GET_ALL_CUSTOMER;
import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_GET_CUSTOMER_BY_COLUMN;
import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_GET_CUSTOMER_BY_ID;
import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_GET_CUSTOMER_BY_PHONE;
import static com.mrgostepz.smoothspring.db.sql.CustomerSQL.SQL_UPDATE_CUSTOMER;


@Service
@RequiredArgsConstructor
public class CustomerDAO implements CustomerRepository {

    private static final Logger logger = LogManager.getLogger(CustomerDAO.class);

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAll() {
        try {
            return jdbcTemplate.query(SQL_GET_ALL_CUSTOMER, new CustomerRowMapper());
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Customer getById(Integer id) {
        try {
            return jdbcTemplate.queryForObject(SQL_GET_CUSTOMER_BY_ID, new CustomerRowMapper(), id);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Integer add(Customer customer) {
        DataSource dataSource = jdbcTemplate.getDataSource();
        assert dataSource != null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_ADD_CUSTOMER, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setString(3, customer.getPhone());
            statement.setString(4, customer.getEmail());
            statement.setString(5, customer.getAddress());
            statement.setDate(6, customer.getDateOfBirth());
            statement.setDate(7, customer.getLastActive());
            statement.setString(8, customer.getCard());
            statement.setInt(9, customer.getTotalOrder());
            statement.setInt(10, customer.getIsActive());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating staff failed, no rows affected.");
            }
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    customer.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating staff failed, no ID obtained.");
                }
            }
            return customer.getId();
        } catch (DataAccessException | SQLException ex) {
            logger.error(ex.getMessage());
            return -1;
        } finally {
            logger.info("Create new Customer: {}", customer);
        }
    }


    @Override
    public Boolean update(Customer customer) {
        try {
            int result = jdbcTemplate.update(SQL_UPDATE_CUSTOMER,
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getPhone(),
                    customer.getEmail(),
                    customer.getAddress(),
                    customer.getDateOfBirth(),
                    customer.getLastActive(),
                    customer.getTotalOrder(),
                    customer.getIsActive(),
                    customer.getId());
            return result == 1;
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Boolean deleteById(Integer id) {
        try {
            int result = jdbcTemplate.update(SQL_DELETE_CUSTOMER, id);
            return result == 1;
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public List<Customer> getCustomerInfoByColumn(String columnName, String value) {
        try {
            return jdbcTemplate.query(SQL_GET_CUSTOMER_BY_COLUMN, new CustomerRowMapper(), columnName, value);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Customer getCustomerInfoByPhone(String phone) {
        try {
            return jdbcTemplate.queryForObject(SQL_GET_CUSTOMER_BY_PHONE, new CustomerRowMapper(), phone);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }
}
