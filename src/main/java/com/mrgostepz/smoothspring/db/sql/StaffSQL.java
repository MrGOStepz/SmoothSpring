package com.mrgostepz.smoothspring.db.sql;

import static com.mrgostepz.smoothspring.db.ColumnName.CLOCK_STATUS;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_EMAIL;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_FIRST_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_LAST_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PASSWORD;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PHONE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_STAFF_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.STAFF_POSITION;
import static com.mrgostepz.smoothspring.db.TableName.TABLE_STAFF;

public class StaffSQL {
    public static final String SQL_GET_ALL_STAFF = "SELECT * FROM " + TABLE_STAFF + ";";
    public static final String SQL_GET_STAFF_BY_ID = "SELECT * FROM " + TABLE_STAFF + " WHERE " + COL_STAFF_ID + " = ?;";
    public static final String SQL_GET_STAFF_BY_PASSWORD = "SELECT * FROM " + TABLE_STAFF + " WHERE " + COL_PASSWORD + " = ?;";
    public static final String SQL_GET_STAFF_BY_COLUMN = "SELECT ? FROM " + TABLE_STAFF + " WHERE ? = ?";
    public static final String SQL_ADD_STAFF = "INSERT INTO " + TABLE_STAFF + " (" + COL_FIRST_NAME + ", " + COL_LAST_NAME + ", " + COL_PHONE + ", " + COL_EMAIL + ", " + STAFF_POSITION + ", " + CLOCK_STATUS + ", " + COL_PASSWORD + ", " + COL_IS_ACTIVE + ") VALUE(?,?,?,?,?,?,?,?);";
    public static final String SQL_UPDATE_STAFF = "UPDATE STAFF SET(" + COL_FIRST_NAME + " = ?, " + COL_LAST_NAME + " = ?, " + COL_PHONE + " = ?, " + COL_EMAIL + " = ?, " + STAFF_POSITION + " = ?, " + CLOCK_STATUS + " = ?, " + COL_PASSWORD + " = ?, " + COL_IS_ACTIVE + " = ?) WHERE " + COL_STAFF_ID + " = ?;";
    public static final String SQL_DELETE_STAFF = "DELETE FROM " + TABLE_STAFF + " WHERE " + COL_STAFF_ID + " = ?;";
}
