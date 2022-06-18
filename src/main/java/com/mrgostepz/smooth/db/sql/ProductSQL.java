package com.mrgostepz.smooth.db.sql;

import static com.mrgostepz.smooth.db.ColumnName.COL_DESCRIPTION;
import static com.mrgostepz.smooth.db.ColumnName.COL_FOOD_TYPE;
import static com.mrgostepz.smooth.db.ColumnName.COL_FOOD_TYPE_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_IS_AVAILABLE;
import static com.mrgostepz.smooth.db.ColumnName.COL_POPUP_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_PRICE;
import static com.mrgostepz.smooth.db.ColumnName.COL_PRODUCT_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smooth.db.ColumnName.COL_PRODUCT_IMAGE_PATH;
import static com.mrgostepz.smooth.db.ColumnName.COL_PRODUCT_INGREDIENT_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_PRODUCT_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_SHORT_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_STOCK;
import static com.mrgostepz.smooth.db.TableName.TABLE_PRODUCT;

public class ProductSQL {
    public static final String SQL_GET_ALL_PRODUCT = "SELECT * FROM " + TABLE_PRODUCT + ";";
    public static final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM " + TABLE_PRODUCT + " WHERE " + COL_PRODUCT_ID +" = ?;";
    public static final String SQL_GET_PRODUCT_BY_COLUMN = "SELECT ? FROM " + TABLE_PRODUCT + " WHERE ? = ?";
    public static final String SQL_ADD_PRODUCT = "INSERT INTO " + TABLE_PRODUCT + " ("
            + COL_PRODUCT_NAME + ", "
            + COL_DESCRIPTION + ", "
            + COL_IS_AVAILABLE + ", "
            + COL_STOCK + ", "
            + COL_PRICE + ", "
            + COL_FOOD_TYPE + ", "
            + COL_IS_ACTIVE +") VALUE(?,?,?,?,?,?,?);";
    public static final String SQL_UPDATE_PRODUCT = "UPDATE " + TABLE_PRODUCT + " SET("
            + COL_PRODUCT_NAME + " = ?, "
            + COL_DESCRIPTION + " = ?, "
            + COL_IS_AVAILABLE + " = ?, "
            + COL_STOCK + " = ?, "
            + COL_PRICE + " = ?, "
            + COL_FOOD_TYPE + " = ?) WHERE "
            + COL_PRODUCT_ID + " = ?;";
    public static final String SQL_DELETE_PRODUCT = "DELETE FROM " + TABLE_PRODUCT + " WHERE " + COL_PRODUCT_ID + "} = ?;";
}
