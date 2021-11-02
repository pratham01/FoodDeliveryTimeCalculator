package com.meal;

public class Meal implements MealCourse {
    private char name;
    private int timeAllocate;
    private int slotAllocate;

    public Meal(char name, int timeAllocate, int slotAllocate){
        this.name = name;
        this.timeAllocate = timeAllocate;
        this.slotAllocate = slotAllocate;
    }

    @Override
    public char getMealCourseName() {
        return name;
    }

    @Override
    public int getTimeAllocate() {
        return timeAllocate;
    }

    @Override
    public int getSlotAllocate() {
        return slotAllocate;
    }
}
