package com.mrgostepz.smooth.model.enumtype;

public enum PaymentType {
    CASH("Cash"),
    VISA("Visa"),
    MASTER_CARD("MasterCard"),
    EFTPOS("Eftpos"),
    AMEX("Amex"),
    VOUCHER("Voucher"),
    OTHER("Other");

    private final String value;

    PaymentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static PaymentType fromString(String value) {
        for (PaymentType paymentType : PaymentType.values()) {
            if (paymentType.value.equalsIgnoreCase(value)) {
                return paymentType;
            }
        }
        return null;
    }
}
