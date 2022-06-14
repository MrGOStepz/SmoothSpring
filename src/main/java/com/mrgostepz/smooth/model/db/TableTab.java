package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class TableTab {
    private int id;
    private String locationTabName;
    private int locationTabOrder;
    private int locationModeId;
    private int isActive;
}
