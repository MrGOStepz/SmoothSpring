package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Printer {
    private int id;
    private String printerName;
    private String printerIp;
    private String printerPort;
    private int isActive;
}
