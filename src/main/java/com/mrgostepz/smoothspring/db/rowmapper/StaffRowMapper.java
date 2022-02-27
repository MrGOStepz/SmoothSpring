package com.mrgostepz.smoothspring.db.rowmapper;

import com.mrgostepz.smoothspring.model.db.Staff;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffRowMapper implements RowMapper<Staff> {
    @Override
    public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
        Staff staff = new Staff();
        staff.setStaffId(rs.getInt("staff_id"));
        staff.setFirstName(rs.getString("first_name"));
        staff.setLastName(rs.getString("last_name"));
        staff.setPhone(rs.getString("phone"));
        staff.setEmail(rs.getString("email"));
        staff.setStaffPositionId(rs.getInt("staff_position_id"));
        staff.setClockStatusId(rs.getInt("clock_status_id"));
        staff.setPassword(rs.getString("password"));
        staff.setIsActive(rs.getInt("is_active"));
        return staff;
    }
}
