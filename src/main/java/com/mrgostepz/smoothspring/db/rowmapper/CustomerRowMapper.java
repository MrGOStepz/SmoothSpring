package com.mrgostepz.smoothspring.db.rowmapper;

import com.mrgostepz.smoothspring.model.db.Staff;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mrgostepz.smoothspring.db.ColumnName.COL_CLOCK_STATUS_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_EMAIL;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_FIRST_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_LAST_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PASSWORD;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PHONE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_STAFF_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_STAFF_POSITION_ID;

public class StaffRowMapper implements RowMapper<Staff> {
    @Override
    public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
        Staff staff = new Staff();
        staff.setStaffId(rs.getInt(COL_STAFF_ID));
        staff.setFirstName(rs.getString(COL_FIRST_NAME));
        staff.setLastName(rs.getString(COL_LAST_NAME));
        staff.setPhone(rs.getString(COL_PHONE));
        staff.setEmail(rs.getString(COL_EMAIL));
        staff.setStaffPositionId(rs.getInt(COL_STAFF_POSITION_ID));
        staff.setClockStatusId(rs.getInt(COL_CLOCK_STATUS_ID));
        staff.setPassword(rs.getString(COL_PASSWORD));
        staff.setIsActive(rs.getInt(COL_IS_ACTIVE));
        return staff;
    }
}
