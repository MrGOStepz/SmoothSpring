package com.mrgostepz.smoothspring.db.sql;

import static com.mrgostepz.smoothspring.db.ColumnName.COL_CLOCK_STATUS_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_CLOCK_STATUS_NAME;
import static com.mrgostepz.smoothspring.db.TableName.TABLE_CLOCK_STATUS;

public class ClockStatusSQL {
    public static final String SQL_GET_ALL_CLOCK_STATUS = "SELECT * FROM "+ TABLE_CLOCK_STATUS + ";";
    public static final String SQL_ADD_CLOCK_STATUS = "INSERT INTO " + TABLE_CLOCK_STATUS + " ("+ COL_CLOCK_STATUS_NAME +") VALUE(?);";
    public static final String SQL_UPDATE_CLOCK_STATUS = "UPDATE + " + TABLE_CLOCK_STATUS + " + SET(" + COL_CLOCK_STATUS_NAME + " = ?) WHERE " + COL_CLOCK_STATUS_ID + " = ?;";
    public static final String SQL_DELETE_CLOCK_STATUS = "DELETE FROM " + TABLE_CLOCK_STATUS + " WHERE " + COL_CLOCK_STATUS_ID + "} = ?;";
}
