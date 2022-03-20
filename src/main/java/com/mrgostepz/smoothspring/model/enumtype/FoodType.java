package com.mrgostepz.smoothspring.model.enumtype;

public enum FoodType {
    ENTREE("Entree"),
    MAIN("Main"),
    DESSERT("Dessert"),
    BEVERAGE("Beverage");

    private final String value;

    FoodType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static FoodType fromString(String value) {
        for (FoodType foodType : FoodType.values()) {
            if (foodType.value.equalsIgnoreCase(value)) {
                return foodType;
            }
        }
        return null;
    }
}
