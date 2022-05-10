package com.mrgostepz.smoothspring.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
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
