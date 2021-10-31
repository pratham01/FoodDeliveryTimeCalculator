public class Main {

    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        TimeEstimate estimate = new TimeEstimate();
        float result = estimate.expectedTime(12, new char[]{'A', 'A'}, 5);
        System.out.println(rest.getMenu().getMealMenu().get(1).getSlotAllocate());
    }
}
