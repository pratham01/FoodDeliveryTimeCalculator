import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class OrderSystem {

    Map<Integer, List<MealCategory>> ordersMap = new HashMap<>();

     final int KM_PER_MIN = 8;
    void userOrder(int orderId, List<MealCategory> incomingOrder, float distanace){
        Restaurant rest = new Restaurant();
        int resultAllocation = rest.processOrder(incomingOrder);
        if(resultAllocation == -1){
            System.out.println("Order "+ orderId  +" is denied because the restaurant cannot accommodate it.");
        }else{
            float timeCal = distanace * KM_PER_MIN;
        }
    }



    private int generateOrderId(){
        Random random  = new Random();
        return random.nextInt(90) + 10;
    }
}
