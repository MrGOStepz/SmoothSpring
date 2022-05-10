package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PrinterProduct {
    private int id;
    private int productId;
    private int printerId;
    private int isActive;
}
