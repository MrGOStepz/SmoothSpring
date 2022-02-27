package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Staff {
    private Integer staffId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Integer staffPositionId;
    private Integer clockStatusId;
    private String password;
    private Integer isActive;
}
