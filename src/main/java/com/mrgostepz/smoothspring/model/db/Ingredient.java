package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Ingredient {
    private int id;
    private String ingredientName;
    private String ingredientImagePath;
}
