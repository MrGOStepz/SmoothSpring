package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PrinterLog {
    private int id;
    private String printerId;
    private String printerAt;
    private String printerDetail;
}
