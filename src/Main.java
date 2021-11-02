import com.restaurant.Restaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        OrderSystem orders = new OrderSystem();
        orders.userOrder(12, new char[]{'A', 'A'}, 5);
        orders.userOrder(21, new char[]{'A', 'M'}, 1);
        orders.userOrder(32, new char[]{'M'}, 0.1f);
        orders.userOrder(14, new char[]{'M', 'M', 'M', 'M', 'A', 'A', 'A'}, 10);
        orders.userOrder(22, new char[]{'A'}, 3);
    }
}
