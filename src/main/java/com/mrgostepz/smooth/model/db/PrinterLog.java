package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class PrinterLog {
    private int id;
    private String printerId;
    private String printerAt;
    private String printerDetail;
}
