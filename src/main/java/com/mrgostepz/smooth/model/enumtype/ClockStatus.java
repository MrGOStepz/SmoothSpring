package com.mrgostepz.smooth.model.enumtype;

public enum ClockStatus {
    IN("In"),
    OUT("Out");

    private final String value;

    ClockStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static ClockStatus fromString(String value) {
        for (ClockStatus clockStatus : ClockStatus.values()) {
            if (clockStatus.value.equalsIgnoreCase(value)) {
                return clockStatus;
            }
        }
        return null;
    }
}
