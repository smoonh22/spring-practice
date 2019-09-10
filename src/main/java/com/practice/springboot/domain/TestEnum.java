package com.practice.springboot.domain;

import java.util.HashMap;
import java.util.Map;

public enum TestEnum {
    FIRST(0, "first"),
    SECOND(1, "second");

    //to avoid iterate everytime, use static map
    private static final Map<Integer, TestEnum> map = new HashMap<>();

    static {
        for (TestEnum e :   TestEnum.values()) {
            map.put(e.getSequence(), e);
        }
    }

    private int sequence;
    private String value;

    TestEnum(int sequence, String value) {
        this.sequence = sequence;
        this.value = value;
    }

    public int getSequence() {
        return sequence;
    }

    public String getValue() {
        return value;
    }

    public static TestEnum getEnumBySequence(int sequence) {
        return map.get(sequence);
    }

}
