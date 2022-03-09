package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Staff {
    private Integer staffId = 0;
    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String email = "";
    private Integer staffPositionId = 3;
    private Integer clockStatusId = 2;
    private String password = "";
    private Integer isActive = 1;
}
