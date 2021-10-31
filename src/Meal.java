public class Meal implements  MealCourse {

    private int timeAllocate;
    private int slotAllocate;

    Meal(int timeAllocate, int slotAllocate){
        this.timeAllocate = timeAllocate;
        this.slotAllocate = slotAllocate;
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
