package com.meal;

public enum MealCategory {
    A('A'), M('M');

    public char asChar() {
        return asChar;
    }

    private final char asChar;

    MealCategory(char asChar) {
        this.asChar = asChar;
    }
}
