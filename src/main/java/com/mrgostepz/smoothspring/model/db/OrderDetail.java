package com.mrgostepz.smoothspring.model.db;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDetail {
    private int orderDetailId;
    private int productId;
    private int popupItemId;
    private int orderId;
    private String cookStatus;
    private int productQuality;
    private Double amount;
    private String comment;
    private int isActive;
}
