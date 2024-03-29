package com.mrgostepz.smooth.model.db;

import lombok.Data;

@Data
public class TableSection {
    private int id;
    private String tableSectionName;
    private String uniqueName;
    private int sectionId;
    private Float marginTop;
    private Float marginBottom;
    private Float marginRight;
    private Float marginLeft;
    private Float height;
    private Float left;
    private int isActive;
}
