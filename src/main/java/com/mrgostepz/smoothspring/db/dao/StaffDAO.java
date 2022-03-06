package com.mrgostepz.smoothspring.db.dao;

import com.mrgostepz.smoothspring.db.repository.CrudRepository;
import com.mrgostepz.smoothspring.db.repository.StaffRepository;
import com.mrgostepz.smoothspring.db.rowmapper.StaffRowMapper;
import com.mrgostepz.smoothspring.model.db.Staff;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_ADD_STAFF;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_DELETE_STAFF;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_GET_ALL_STAFF;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_GET_STAFF_BY_ID;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_GET_STAFF_BY_PASSWORD;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_UPDATE_STAFF;


//https://mkyong.com/spring/spring-jdbctemplate-querying-examples/
@Service
public class StaffDAO implements StaffRepository, CrudRepository<Staff, Integer> {

    private static final Logger logger = LogManager.getLogger(StaffDAO.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Staff> getAll() {
        try {
            return jdbcTemplate.query(SQL_GET_ALL_STAFF, new StaffRowMapper());
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Staff getById(Integer id) {
        try {
            return jdbcTemplate.queryForObject(SQL_GET_STAFF_BY_ID, new StaffRowMapper(), id);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Integer add(Staff staff) {
        DataSource dataSource = jdbcTemplate.getDataSource();
        assert dataSource != null;
        try (Connection connection =  dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_ADD_STAFF,Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, staff.getFirstName());
            statement.setString(2, staff.getLastName());
            statement.setString(3, staff.getPhone());
            statement.setString(4, staff.getEmail());
            statement.setInt(5, staff.getStaffPositionId());
            statement.setInt(6, staff.getClockStatusId());
            statement.setString(7, staff.getPassword());
            statement.setInt(8, staff.getIsActive());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating staff failed, no rows affected.");
            }
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    staff.setStaffId(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Creating staff failed, no ID obtained.");
                }
            }
            return staff.getStaffId();
        } catch (DataAccessException | SQLException ex) {
            logger.error(ex.getMessage());
            return -1;
        } finally {
            logger.info("Create new staff: {}", staff);
        }
    }

    @Override
    public Boolean update(Staff staff) {
        try {
            int result = jdbcTemplate.update(SQL_UPDATE_STAFF,
                    staff.getFirstName(),
                    staff.getLastName(),
                    staff.getPhone(),
                    staff.getEmail(),
                    staff.getStaffPositionId(),
                    staff.getClockStatusId(),
                    staff.getPassword(),
                    staff.getIsActive(),
                    staff.getStaffId());
            return result == 1;
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Boolean deleteById(Integer id) {
        try {
            int result = jdbcTemplate.update(SQL_DELETE_STAFF, id);
            return result == 1;
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public List<Staff> getByPassword(String password) {
        try {
            return jdbcTemplate.query(SQL_GET_STAFF_BY_PASSWORD, new StaffRowMapper(), password);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }
}
