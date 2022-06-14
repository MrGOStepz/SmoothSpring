package com.mrgostepz.smooth.model.enumtype;

public enum StaffPosition {
    ADMIN("Admin"),
    MANAGER("Manager"),
    STAFF("Staff"),
    TRAINEE("Trainee"),
    GUEST("Guest");

    private final String value;

    StaffPosition(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static StaffPosition fromString(String value) {
        for (StaffPosition staffPosition : StaffPosition.values()) {
            if (staffPosition.value.equalsIgnoreCase(value)) {
                return staffPosition;
            }
        }
        return null;
    }
}
