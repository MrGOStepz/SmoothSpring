package com.mrgostepz.smooth.db.sql;

import static com.mrgostepz.smooth.db.ColumnName.COL_COOK_STATUS_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_COOK_STATUS_NAME;
import static com.mrgostepz.smooth.db.TableName.TABLE_COOK_STATUS;

public class CookStatusSQL {
    public static final String SQL_GET_ALL_COOK_STATUS = "SELECT * FROM " + TABLE_COOK_STATUS;
    public static final String SQL_ADD_COOK_STATUS = "INSERT INTO " + TABLE_COOK_STATUS + " (" + COL_COOK_STATUS_NAME + ") VALUE(?);";
    public static final String SQL_UPDATE_COOK_STATUS = "UPDATE " + TABLE_COOK_STATUS + " SET(" + COL_COOK_STATUS_NAME + " = ?) WHERE " + COL_COOK_STATUS_ID + " = ?;";
    public static final String SQL_DELETE_COOK_STATUS = "DELETE FROM " + TABLE_COOK_STATUS + " WHERE " + COL_COOK_STATUS_ID + "} = ?;";
}
