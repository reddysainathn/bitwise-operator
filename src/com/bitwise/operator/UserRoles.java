package com.bitwise.operator;

import java.util.HashMap;
import java.util.Map;

public enum UserRoles {

    NONE(1), READ(2), WRITE(4), EXECUTE(8), SUPER_USER(16), ADMIN(32), OWNER(64);

    private int value;
    private static Map map = new HashMap<>();

    private UserRoles(int value) {
        this.value = value;
    }

    static {
        for (UserRoles pageType : UserRoles.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static UserRoles valueOf(int pageType) {
        return (UserRoles) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}