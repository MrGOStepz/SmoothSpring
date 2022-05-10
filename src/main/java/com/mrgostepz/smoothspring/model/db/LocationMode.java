package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LocationMode {
    private int id;
    private String locationModeName;
    private int locationModeOrder;
    private int isActive;
}
