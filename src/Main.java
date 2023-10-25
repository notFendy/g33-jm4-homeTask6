import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Bekzod"));
        orders.add(new Order(2, "Jasur"));
        orders.add(new Order(3, "Xurshid"));

        int threadPoolSize = 3;
        OrderProcessor orderProcessor = new OrderProcessor(threadPoolSize);
        orderProcessor.processOrders(orders);
    }
}