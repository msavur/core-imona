package com.imona.core.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    UNKNOWN("Unknown");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public static Gender findGenderType(String value) {
        return Arrays.stream(Gender.values())
                .filter(gender -> gender.value.equals(value))
                .findFirst()
                .orElse(Gender.UNKNOWN);
    }
}
