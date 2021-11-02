package com.restaurant;

import com.meal.Meal;
import com.meal.MealCourse;
import com.meal.MealMenu;

public class Restaurant implements PropertyDeails {

    private final static int MAX_SLOT =7;

    private MealMenu mealMenu = new MealMenu();

    public Restaurant(){
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
        mealMenu.addMealMenu(new Meal('A',17,1));
        mealMenu.addMealMenu(new Meal('M',29, 2));
    }


    public int processOrder(char[] incomingOrder) {
        int totalAllocation=0;
        int allocation = -1;

        for(int i=0 ; i< incomingOrder.length; i++){
            MealCourse mCourse = mealMenu.getMealMenu().get(incomingOrder[i]);
            totalAllocation+=mCourse.getSlotAllocate();
            allocation = Math.max(allocation,mCourse.getTimeAllocate());
        }

        return (totalAllocation > MAX_SLOT )? -1:  allocation;
    }
}
