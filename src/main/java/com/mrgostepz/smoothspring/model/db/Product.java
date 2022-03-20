package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private int id;
    private String productName;
    private String description;
    private int isAvailable;
    private int productIngredientId;
    private int popupId;
    private int stock;
    private Double price;
    private String productImagePath;
    private int foodTypeId;
    private int isActive;
}
