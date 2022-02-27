package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocationMode {
    private int id;
    private String locationModeName;
    private int locationModeOrder;
    private int isActive;
}
