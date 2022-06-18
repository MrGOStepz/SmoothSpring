package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private String foodType;
    private String description;
    private Integer stock;
    private Double price;
    private Integer isAvailable;
    private Integer isActive;
}
