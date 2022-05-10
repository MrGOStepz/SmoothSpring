package com.mrgostepz.smoothspring.model.db;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
