package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Section {
    private int id;
    private String sectionName;
    private int isActive;
}
