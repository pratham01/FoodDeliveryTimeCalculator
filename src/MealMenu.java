import java.util.ArrayList;
import java.util.List;

public class MealMenu {

   List<MealCourse> mealList = new ArrayList<>();

    public void addMealMenu(MealCourse meal){
       mealList.add(meal);
    }

    public List<MealCourse> getMealMenu(){ return  mealList;}
}
