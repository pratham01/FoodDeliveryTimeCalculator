package com.meal;

import java.util.HashMap;
import java.util.Map;

public class MealMenu {

   private Map<Character, MealCourse> mealList = new HashMap<>();

    public void addMealMenu(MealCourse meal){
       mealList.put(meal.getMealCourseName(),meal);
    }
    public  Map<Character, MealCourse> getMealMenu(){ return  mealList;}
}
