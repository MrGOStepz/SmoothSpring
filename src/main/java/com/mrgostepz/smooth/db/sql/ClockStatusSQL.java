package com.mrgostepz.smooth.db.sql;

import static com.mrgostepz.smooth.db.ColumnName.CLOCK_STATUS;
import static com.mrgostepz.smooth.db.ColumnName.COL_CLOCK_STATUS_NAME;
import static com.mrgostepz.smooth.db.TableName.TABLE_CLOCK_STATUS;

public class ClockStatusSQL {
    public static final String SQL_GET_ALL_CLOCK_STATUS = "SELECT * FROM "+ TABLE_CLOCK_STATUS + ";";
    public static final String SQL_ADD_CLOCK_STATUS = "INSERT INTO " + TABLE_CLOCK_STATUS + " ("+ COL_CLOCK_STATUS_NAME +") VALUE(?);";
    public static final String SQL_UPDATE_CLOCK_STATUS = "UPDATE + " + TABLE_CLOCK_STATUS + " + SET(" + COL_CLOCK_STATUS_NAME + " = ?) WHERE " + CLOCK_STATUS + " = ?;";
    public static final String SQL_DELETE_CLOCK_STATUS = "DELETE FROM " + TABLE_CLOCK_STATUS + " WHERE " + CLOCK_STATUS + "} = ?;";
}
