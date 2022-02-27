package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PopupItem {
    private int id;
    private String popupItemName;
    private int popupId;
    private Float price;
    private String popupImagePath;
}
