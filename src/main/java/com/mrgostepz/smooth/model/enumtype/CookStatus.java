package com.mrgostepz.smooth.model.enumtype;

public enum CookStatus {
    COOKING("Cooking"),
    DONE("Done"),
    BREAK("Break");

    private final String value;

    CookStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static CookStatus fromString(String value) {
        for (CookStatus cookstatus : CookStatus.values()) {
            if (cookstatus.value.equalsIgnoreCase(value)) {
                return cookstatus;
            }
        }
        return null;
    }
}
