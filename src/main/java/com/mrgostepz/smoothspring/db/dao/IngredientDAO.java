package com.mrgostepz.smoothspring.db.dao;

import com.mrgostepz.smoothspring.db.repository.IngredientRepository;
import com.mrgostepz.smoothspring.db.rowmapper.IngredientRowMapper;
import com.mrgostepz.smoothspring.model.db.Ingredient;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.mrgostepz.smoothspring.db.sql.IngredientSQL.SQL_ADD_INGREDIENT;
import static com.mrgostepz.smoothspring.db.sql.IngredientSQL.SQL_DELETE_INGREDIENT;
import static com.mrgostepz.smoothspring.db.sql.IngredientSQL.SQL_GET_ALL_INGREDIENT;
import static com.mrgostepz.smoothspring.db.sql.IngredientSQL.SQL_GET_INGREDIENT_BY_COLUMN;
import static com.mrgostepz.smoothspring.db.sql.IngredientSQL.SQL_GET_INGREDIENT_BY_ID;
import static com.mrgostepz.smoothspring.db.sql.IngredientSQL.SQL_UPDATE_INGREDIENT;


@Service
@RequiredArgsConstructor
public class IngredientDAO implements IngredientRepository {

    private static final Logger logger = LogManager.getLogger(IngredientDAO.class);

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Ingredient> getAll() {
        try {
            return jdbcTemplate.query(SQL_GET_ALL_INGREDIENT, new IngredientRowMapper());
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Ingredient getById(Integer id) {
        try {
            return jdbcTemplate.queryForObject(SQL_GET_INGREDIENT_BY_ID, new IngredientRowMapper(), id);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Integer add(Ingredient ingredient) {
        DataSource dataSource = jdbcTemplate.getDataSource();
        assert dataSource != null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_ADD_INGREDIENT, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, ingredient.getIngredientName());
            statement.setString(2, ingredient.getIngredientImagePath());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating ingredient failed, no rows affected.");
            }
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    ingredient.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating ingredient failed, no ID obtained.");
                }
            }
            return ingredient.getId();
        } catch (DataAccessException | SQLException ex) {
            logger.error(ex.getMessage());
            return -1;
        } finally {
            logger.info("Create new Ingredient: {}", ingredient);
        }
    }


    @Override
    public Boolean update(Ingredient ingredient) {
        try {
            int result = jdbcTemplate.update(SQL_UPDATE_INGREDIENT,
                    ingredient.getIngredientName(),
                    ingredient.getIngredientImagePath(),
                    ingredient.getId());
            return result == 1;
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Boolean deleteById(Integer id) {
        try {
            int result = jdbcTemplate.update(SQL_DELETE_INGREDIENT, id);
            return result == 1;
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }

    @Override
    public List<Ingredient> getIngredientInfoByColumn(String columnName, String value) {
        try {
            return jdbcTemplate.query(SQL_GET_INGREDIENT_BY_COLUMN, new IngredientRowMapper(), columnName, value);
        } catch (DataAccessException ex) {
            logger.error(ex.getMessage());
            throw ex;
        }
    }
}
