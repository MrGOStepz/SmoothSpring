package com.mrgostepz.smooth.model.db;

import com.mrgostepz.smooth.model.enumtype.ClockStatus;
import com.mrgostepz.smooth.model.enumtype.StaffPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
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
