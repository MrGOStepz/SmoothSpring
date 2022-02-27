package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrinterLog {
    private int id;
    private String printerId;
    private String printerAt;
    private String printerDetail;
}
