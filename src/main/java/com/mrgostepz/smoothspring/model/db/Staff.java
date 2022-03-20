package com.mrgostepz.smoothspring.model.db;

import com.mrgostepz.smoothspring.model.enumtype.ClockStatus;
import com.mrgostepz.smoothspring.model.enumtype.StaffPosition;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Staff {
    private Integer Id = 0;
    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String email = "";
    private String staffPosition = StaffPosition.STAFF.getValue();
    private String clockStatus = ClockStatus.IN.getValue();
    private String password = "";
    private Integer isActive = 1;
}
