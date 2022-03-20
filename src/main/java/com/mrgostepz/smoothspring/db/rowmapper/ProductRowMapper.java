package com.mrgostepz.smoothspring.db.rowmapper;

import com.mrgostepz.smoothspring.model.db.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mrgostepz.smoothspring.db.ColumnName.COL_DESCRIPTION;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_FOOD_TYPE_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_IS_AVAILABLE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_POPUP_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PRICE;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PRODUCT_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PRODUCT_IMAGE_PATH;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PRODUCT_INGREDIENT_ID;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_PRODUCT_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_SHORT_NAME;
import static com.mrgostepz.smoothspring.db.ColumnName.COL_STOCK;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setId(rs.getInt(COL_PRODUCT_ID));
        product.setProductName(rs.getString(COL_PRODUCT_NAME));
        product.setShortName(rs.getString(COL_SHORT_NAME));
        product.setDescription(rs.getString(COL_DESCRIPTION));
        product.setIsAvailable(rs.getInt(COL_IS_AVAILABLE));
        product.setProductIngredientId(rs.getInt(COL_PRODUCT_INGREDIENT_ID));
        product.setPopupId(rs.getInt(COL_POPUP_ID));
        product.setStock(rs.getInt(COL_STOCK));
        product.setPrice(rs.getDouble(COL_PRICE));
        product.setProductImagePath(rs.getString(COL_PRODUCT_IMAGE_PATH));
        product.setFoodTypeId(rs.getInt(COL_FOOD_TYPE_ID));
        product.setIsActive(rs.getInt(COL_IS_ACTIVE));
        return product;
    }
}
