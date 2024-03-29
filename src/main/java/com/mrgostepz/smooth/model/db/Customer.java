package com.mrgostepz.smooth.model.db;

import lombok.Data;

import java.sql.Date;

@Data
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
