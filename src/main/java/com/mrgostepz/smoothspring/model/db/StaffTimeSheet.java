package com.mrgostepz.smoothspring.model.db;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StaffTimeSheet {
    private int id;
    private Staff staff;
    private Date clockIn;
    private Date clockOut;
}
