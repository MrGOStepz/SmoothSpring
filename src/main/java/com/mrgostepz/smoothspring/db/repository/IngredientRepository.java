package com.mrgostepz.smoothspring.db.repository;

import com.mrgostepz.smoothspring.model.db.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{
    List<Ingredient> getIngredientInfoByColumn(String columnName, String value);
}
