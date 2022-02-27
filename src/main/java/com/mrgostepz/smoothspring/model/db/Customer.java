package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private Date dateOfBirth;
    private Date lastActive;
    private String card;
    private int totalOrder;
    private int isActive;
}
