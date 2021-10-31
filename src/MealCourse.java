public enum MealCourse {
    A(1,17),
    M(2, 29);

    private final int slotAllocate;
    private final int timeAllocate;
    MealCourse(int slotAllocate, int timeAllocate){
        this.slotAllocate = slotAllocate;
        this.timeAllocate = timeAllocate;
    }

    public int getTimeAllocate() {
        return timeAllocate;
    }

    public int getSlotAllocate() {
        return slotAllocate;
    }
}
