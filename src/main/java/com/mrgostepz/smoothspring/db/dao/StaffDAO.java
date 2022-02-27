package com.mrgostepz.smoothspring.db.dao;

import com.mrgostepz.smoothspring.db.repository.CrudRepository;
import com.mrgostepz.smoothspring.db.repository.StaffRepository;
import com.mrgostepz.smoothspring.db.rowmapper.StaffRowMapper;
import com.mrgostepz.smoothspring.model.db.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_ADD_STAFF;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_GET_ALL_STAFF;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_GET_STAFF_BY_ID;
import static com.mrgostepz.smoothspring.db.sql.StaffSQL.SQL_GET_STAFF_BY_PASSWORD;


//https://mkyong.com/spring/spring-jdbctemplate-querying-examples/
@Service
public class StaffDAO implements StaffRepository, CrudRepository<Staff, Integer> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Staff> getAll() {
        try {
            List<Staff> result = jdbcTemplate.query(SQL_GET_ALL_STAFF, new StaffRowMapper());
            return result;
        } catch (Exception ex) {
            throw ex;
        }

    }

    @Override
    public Staff getById(Integer id) {
        Staff result = jdbcTemplate.queryForObject(SQL_GET_STAFF_BY_ID, new StaffRowMapper(), id);
        return result;
    }

    @Override
    public Boolean add(Staff staff) {
        try {
            jdbcTemplate.update(SQL_ADD_STAFF, staff.getFirstName(), staff.getLastName(), staff.getPhone(), staff.getEmail(), staff.getStaffPositionId(), staff.getClockStatusId(), staff.getPassword(), staff.getIsActive());
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public Boolean update(Staff staff) {
//        SQL_UPDATE_STAFF
        return null;
    }

    @Override
    public Boolean deleteById(Integer integer) {
//        SQL_DELETE_STAFF
        return null;
    }

    @Override
    public List<Staff> getByPassword(String password) {
        List<Staff> result = jdbcTemplate.query(SQL_GET_STAFF_BY_PASSWORD, new StaffRowMapper(), password);
        return result;
    }
}
