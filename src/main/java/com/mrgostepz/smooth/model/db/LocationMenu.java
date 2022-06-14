package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class LocationMenu {
    private int id;
    private int productId;
    private int locationTabId;
    private int columnNumber;
    private int rowNumber;
    private int isActive;
}
