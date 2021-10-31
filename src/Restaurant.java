import java.util.List;

public class Restaurant implements  PropertyDeails {

    private final static int MAX_SLOT =7;

    private MealMenu  mealMenu = new MealMenu();

    Restaurant(){
        populateMealMenu();
    }
    @Override
    public int getAvailableSlot() {
        return MAX_SLOT;
    }

    public MealMenu getMenu(){
        return mealMenu;
    }

    private void populateMealMenu(){
        mealMenu.addMealMenu(new Meal('A',1,17));
        mealMenu.addMealMenu(new Meal('M',2, 29));
    }


    public int processOrder(List<MealCategory> incomingOrder) {
        int totalAllocation=0;
        int allocation = 0;
        int i=0;

        for(MealCategory mealCat: incomingOrder){
            if(mealMenu.mealList.get(i).getMealCourseName() == mealCat.asChar()){
                totalAllocation+= mealMenu.mealList.get(i).getSlotAllocate();
                allocation = Math.max(allocation,mealMenu.mealList.get(i).getTimeAllocate());
            }else{
                totalAllocation+= mealMenu.mealList.get(i).getSlotAllocate();
                allocation = Math.max(allocation,mealMenu.mealList.get(i).getTimeAllocate());
            }
            i++;
        }

        if(totalAllocation > MAX_SLOT) return -1;
        return allocation;
    }
}
