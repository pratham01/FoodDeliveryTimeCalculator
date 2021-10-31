public class Main {

    public static void main(String[] args) {
        Restaurant rest = new Restaurant();

        System.out.println(rest.getMenu().getMealMenu().get('A').getSlotAllocate());
    }
}
