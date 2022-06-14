package com.mrgostepz.smooth.model.db;

import java.sql.Date;

import lombok.Data;

@Data
public class Order {
    private int id;
    private Date orderAt;
    private int orderTypeId;
    private int staffId;
    private int tableSectionId;
    private String orderStatus;
    private String payment;
    private int customerId;
    private int isActive;
}
