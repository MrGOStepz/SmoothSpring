package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocationMenu {
    private int id;
    private int productId;
    private int locationTabId;
    private int columnNumber;
    private int rowNumber;
    private int isActive;
}
