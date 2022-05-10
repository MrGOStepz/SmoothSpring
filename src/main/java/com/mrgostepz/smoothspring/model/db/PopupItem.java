package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PopupItem {
    private int id;
    private String popupItemName;
    private int popupId;
    private Float price;
    private String popupImagePath;
}
