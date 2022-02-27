package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ingredient {
    private int id;
    private String ingredientName;
    private String ingredientImagePath;
}
