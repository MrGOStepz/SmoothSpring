package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class Printer {
    private int id;
    private String printerName;
    private String printerIp;
    private String printerPort;
    private int isActive;
}
