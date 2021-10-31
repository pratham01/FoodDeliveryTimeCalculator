import java.util.HashMap;
import java.util.Map;

public class MealMenu {

    Map<Character, MealCourse> mealMenu = new HashMap<>();

    public void addMealMenu(char ch, MealCourse meal){
       mealMenu.put(ch, meal);
    }

    public Map<Character, MealCourse> getMealMenu(){ return  mealMenu;}
}
