package com.mrgostepz.smooth.model.db;

import java.sql.Date;

import lombok.Data;

@Data
public class StaffTimeSheet {
    private int id;
    private Staff staff;
    private Date clockIn;
    private Date clockOut;
}
