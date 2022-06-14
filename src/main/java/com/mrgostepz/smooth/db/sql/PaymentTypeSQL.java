package com.mrgostepz.smooth.db.sql;

import static com.mrgostepz.smooth.db.ColumnName.COL_PAYMENT_TYPE_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_PAYMENT_TYPE_NAME;
import static com.mrgostepz.smooth.db.TableName.TABLE_PAYMENT_TYPE;

public class PaymentTypeSQL {
    public static final String SQL_GET_ALL_PAYMENT_TYPE = "SELECT * FROM " + TABLE_PAYMENT_TYPE + ";";
    public static final String SQL_ADD_PAYMENT_TYPE = "INSERT INTO " + TABLE_PAYMENT_TYPE + " (" + COL_PAYMENT_TYPE_NAME + ") VALUE(?);";
    public static final String SQL_UPDATE_PAYMENT_TYPE = "UPDATE " + TABLE_PAYMENT_TYPE + " SET(" + COL_PAYMENT_TYPE_NAME + " = ?) WHERE " + COL_PAYMENT_TYPE_ID + " = ?;";
    public static final String SQL_DELETE_PAYMENT_TYPE = "DELETE FROM " + TABLE_PAYMENT_TYPE + " WHERE " + COL_PAYMENT_TYPE_ID + "} = ?;";
}
