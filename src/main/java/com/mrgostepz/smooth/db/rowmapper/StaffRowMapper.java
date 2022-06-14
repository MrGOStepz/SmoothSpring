package com.mrgostepz.smooth.db.rowmapper;

import com.mrgostepz.smooth.model.db.Staff;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mrgostepz.smooth.db.ColumnName.CLOCK_STATUS;
import static com.mrgostepz.smooth.db.ColumnName.COL_EMAIL;
import static com.mrgostepz.smooth.db.ColumnName.COL_FIRST_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smooth.db.ColumnName.COL_LAST_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_PASSWORD;
import static com.mrgostepz.smooth.db.ColumnName.COL_PHONE;
import static com.mrgostepz.smooth.db.ColumnName.COL_STAFF_ID;
import static com.mrgostepz.smooth.db.ColumnName.STAFF_POSITION;

public class StaffRowMapper implements RowMapper<Staff> {
    @Override
    public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
        Staff staff = new Staff();
        staff.setId(rs.getInt(COL_STAFF_ID));
        staff.setFirstName(rs.getString(COL_FIRST_NAME));
        staff.setLastName(rs.getString(COL_LAST_NAME));
        staff.setPhone(rs.getString(COL_PHONE));
        staff.setEmail(rs.getString(COL_EMAIL));
        staff.setStaffPosition(rs.getString(STAFF_POSITION));
        staff.setClockStatus(rs.getString(CLOCK_STATUS));
        staff.setPassword(rs.getString(COL_PASSWORD));
        staff.setIsActive(rs.getInt(COL_IS_ACTIVE));
        return staff;
    }
}
