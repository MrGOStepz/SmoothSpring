package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class PopupItem {
    private int id;
    private String popupItemName;
    private int popupId;
    private Float price;
    private String popupImagePath;
}
