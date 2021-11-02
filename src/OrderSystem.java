import com.meal.MealCategory;
import com.restaurant.Restaurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class OrderSystem {

    Map<Integer, List<MealCategory>> ordersMap = new HashMap<>();
    private final int MAX_TIME_ALLOW = 150;

     final int KM_PER_MIN = 8;
    void userOrder(int orderId, char[] incomingOrder, float distanace){
        Restaurant rest = new Restaurant();
        int resultAllocation = rest.processOrder(incomingOrder);
        if(resultAllocation == -1){
            System.out.println("Order "+ orderId  +" is denied because the restaurant cannot accommodate it.");
        }else{
            float timeCal = distanace * KM_PER_MIN;
            float finalTime = timeCal+ resultAllocation;
            if(finalTime < MAX_TIME_ALLOW)
                System.out.println("Order "+orderId +" will get delivered in "+ finalTime + " minutes");
            else
                System.out.println("Order "+orderId +" is denied because the estimated time is more that 2 hours 30 minutes");
        }
    }



    private int generateOrderId(){
        Random random  = new Random();
        return random.nextInt(90) + 10;
    }
}
