package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Section {
    private int id;
    private String sectionName;
    private int isActive;
}
