package com.mrgostepz.smoothspring.db.sql;

import static com.mrgostepz.smoothspring.db.ColumnName.COL_FOOD_TYPE_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_FOOD_TYPE_NAME;
import static com.mrgostepz.smoothspring.db.TableName.TABLE_FOOD_TYPE;

public class FoodTypeSQL {
    public static final String SQL_GET_ALL_FOOD_TYPE = "SELECT * FROM " + TABLE_FOOD_TYPE + ";";
    public static final String SQL_ADD_FOOD_TYPE = "INSERT INTO " + TABLE_FOOD_TYPE + " (" + COL_FOOD_TYPE_NAME + ") VALUE(?);";
    public static final String SQL_UPDATE_FOOD_TYPE = "UPDATE " + TABLE_FOOD_TYPE + " SET(" + COL_FOOD_TYPE_NAME + " = ?) WHERE " + COL_FOOD_TYPE_ID + " = ?;";
    public static final String SQL_DELETE_FOOD_TYPE = "DELETE FROM " + TABLE_FOOD_TYPE + " WHERE " + COL_FOOD_TYPE_ID + "} = ?;";
}
