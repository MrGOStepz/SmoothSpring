package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class LocationMode {
    private int id;
    private String locationModeName;
    private int locationModeOrder;
    private int isActive;
}
