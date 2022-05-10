package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Popup {
    private int id;
    private String popupName;
    private int isActive;
}
