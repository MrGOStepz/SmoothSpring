package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class PrinterProduct {
    private int id;
    private int productId;
    private int printerId;
    private int isActive;
}
