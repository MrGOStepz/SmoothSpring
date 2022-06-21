package com.mrgostepz.smooth.db.rowmapper;

import com.mrgostepz.smooth.model.db.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mrgostepz.smooth.db.ColumnName.COL_DESCRIPTION;
import static com.mrgostepz.smooth.db.ColumnName.COL_FOOD_TYPE;
import static com.mrgostepz.smooth.db.ColumnName.COL_ID;
import static com.mrgostepz.smooth.db.ColumnName.COL_IS_ACTIVE;
import static com.mrgostepz.smooth.db.ColumnName.COL_IS_AVAILABLE;
import static com.mrgostepz.smooth.db.ColumnName.COL_NAME;
import static com.mrgostepz.smooth.db.ColumnName.COL_PRICE;
import static com.mrgostepz.smooth.db.ColumnName.COL_STOCK;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setId(rs.getInt(COL_ID));
        product.setName(rs.getString(COL_NAME));
        product.setDescription(rs.getString(COL_DESCRIPTION));
        product.setIsAvailable(rs.getInt(COL_IS_AVAILABLE));
        product.setStock(rs.getInt(COL_STOCK));
        product.setPrice(rs.getDouble(COL_PRICE));
        product.setFoodType(rs.getString(COL_FOOD_TYPE));
        product.setIsActive(rs.getInt(COL_IS_ACTIVE));
        return product;
    }
}
