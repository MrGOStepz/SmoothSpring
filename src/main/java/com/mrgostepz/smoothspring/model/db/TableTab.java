package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TableTab {
    private int id;
    private String locationTabName;
    private int locationTabOrder;
    private int locationModeId;
    private int isActive;
}
