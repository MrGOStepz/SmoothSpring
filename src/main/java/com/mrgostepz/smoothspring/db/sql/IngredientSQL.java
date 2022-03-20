package com.mrgostepz.smoothspring.db.sql;

import static com.mrgostepz.smoothspring.db.ColumnName.COL_INGREDIENT_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_INGREDIENT_IMAGE_PATH;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_INGREDIENT_NAME;
import static com.mrgostepz.smoothspring.db.TableName.TABLE_INGREDIENT;

public class IngredientSQL {
    public static final String SQL_GET_ALL_INGREDIENT = "SELECT * FROM " + TABLE_INGREDIENT + ";";
    public static final String SQL_GET_INGREDIENT_BY_ID = "SELECT * FROM " + TABLE_INGREDIENT + " WHERE " + COL_INGREDIENT_ID + " = ?;";
    public static final String SQL_ADD_INGREDIENT = "INSERT INTO " + TABLE_INGREDIENT + " (" + COL_INGREDIENT_NAME + ", " + COL_INGREDIENT_IMAGE_PATH + ") VALUE(?,?);";
    public static final String SQL_UPDATE_INGREDIENT = "UPDATE " + TABLE_INGREDIENT + " SET(" + COL_INGREDIENT_NAME + " = ?, " + COL_INGREDIENT_IMAGE_PATH + " = ?) WHERE " + COL_INGREDIENT_ID + " = ?;";
    public static final String SQL_DELETE_INGREDIENT = "DELETE FROM " + TABLE_INGREDIENT + " WHERE " + COL_INGREDIENT_ID + "} = ?;";
}
