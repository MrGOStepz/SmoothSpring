package com.mrgostepz.smooth.db.sql;

import static com.mrgostepz.smooth.db.ColumnName.COL_ADDRESS;
import static com.mrgostepz.smooth.db.ColumnName.COL_CARD;
import static com.mrgostepz.smooth.db.ColumnName.COL_CUSTOMER_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_DATE_OF_BIRTH;
import static com.mrgostepz.smooth.db.ColumnName.COL_EMAIL;
import static com.mrgostepz.smooth.db.ColumnName.COL_FIRST_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smooth.db.ColumnName.COL_LAST_ACTIVE;
import static com.mrgostepz.smooth.db.ColumnName.COL_LAST_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_PHONE;
import static com.mrgostepz.smooth.db.ColumnName.COL_TOTAL_ORDER;
import static com.mrgostepz.smooth.db.TableName.TABLE_CUSTOMER;

public class CustomerSQL {
    public static final String SQL_GET_ALL_CUSTOMER = "SELECT * FROM " + TABLE_CUSTOMER + ";";
    public static final String SQL_GET_CUSTOMER_BY_ID = "SELECT * FROM " + TABLE_CUSTOMER + " WHERE " + COL_CUSTOMER_ID +" = ?;";
    public static final String SQL_GET_CUSTOMER_BY_PHONE = "SELECT * FROM " + TABLE_CUSTOMER + " WHERE " + COL_PHONE + " = ?;";
    public static final String SQL_GET_CUSTOMER_BY_COLUMN = "SELECT ? FROM " + TABLE_CUSTOMER + " WHERE ? = ?";
    public static final String SQL_ADD_CUSTOMER = "INSERT INTO " + TABLE_CUSTOMER + " (" + COL_FIRST_NAME + ", " + COL_LAST_NAME + ", " + COL_PHONE + ", " + COL_EMAIL + ", " + COL_ADDRESS + ", " + COL_DATE_OF_BIRTH + ", " + COL_LAST_ACTIVE + ", " + COL_CARD + ", " + COL_TOTAL_ORDER + ", " + COL_IS_ACTIVE +") VALUE(?,?,?,?,?,?,?,?,?,?);";
    public static final String SQL_UPDATE_CUSTOMER = "UPDATE " + TABLE_CUSTOMER + " SET(" + COL_FIRST_NAME + " = ?, " + COL_LAST_NAME + " = ?, " + COL_PHONE + " = ?, " + COL_EMAIL + " = ?, " + COL_ADDRESS + " = ?, " + COL_DATE_OF_BIRTH + " = ?, " + COL_LAST_ACTIVE + " = ?, " + COL_CARD + " = ?, " + COL_TOTAL_ORDER + " = ?, " + COL_IS_ACTIVE + " = ?) WHERE " + COL_CUSTOMER_ID + "} = ?;";
    public static final String SQL_DELETE_CUSTOMER = "DELETE FROM " + TABLE_CUSTOMER + " WHERE " + COL_CUSTOMER_ID + "} = ?;";
}
