package com.mrgostepz.smoothspring.model.db;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
    private int id;
    private Date orderAt;
    private int orderTypeId;
    private int staffId;
    private int tableSectionId;
    private int orderStatusId;
    private int paymentId;
    private int customerId;
    private int isActive;
}
