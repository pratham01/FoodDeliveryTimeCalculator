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
        MealCourse A = new Meal(1,17);
        MealCourse M = new Meal(2, 29);
        mealMenu.addMealMenu('A',A);
        mealMenu.addMealMenu('M',M);


    }
}
