package com.mrgostepz.smoothspring.db.rowmapper;

import com.mrgostepz.smoothspring.model.db.Ingredient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import static com.mrgostepz.smoothspring.db.ColumnName.COL_INGREDIENT_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_INGREDIENT_IMAGE_PATH;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_INGREDIENT_NAME;

public class IngredientRowMapper implements RowMapper<Ingredient> {
    @Override
    public Ingredient mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ingredient ingredient = new Ingredient();
        ingredient.setId(rs.getInt(COL_INGREDIENT_ID));
        ingredient.setIngredientName(rs.getString(COL_INGREDIENT_NAME));
        ingredient.setIngredientImagePath(rs.getString(COL_INGREDIENT_IMAGE_PATH));
        return ingredient;
    }
}
