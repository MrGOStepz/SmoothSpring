package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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

    @Override
    public String toString() {
        return "{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", staffPositionId=" + staffPositionId +
                ", clockStatusId=" + clockStatusId +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
