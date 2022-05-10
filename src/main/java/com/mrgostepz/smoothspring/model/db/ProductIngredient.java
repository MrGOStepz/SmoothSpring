package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ProductIngredient {
    private int productId;
    private int ingredientId;
}
