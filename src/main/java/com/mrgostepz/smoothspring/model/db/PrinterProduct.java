package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrinterProduct {
    private int id;
    private int productId;
    private int printerId;
    private int isActive;
}
