package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TableTab {
    private int id;
    private String locationTabName;
    private int locationTabOrder;
    private int locationModeId;
    private int isActive;
}
