package com.mrgostepz.smoothspring.db.repository;

import com.mrgostepz.smoothspring.model.db.Ingredient;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{

}
