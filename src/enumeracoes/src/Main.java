import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(
                UUID.randomUUID(),
                LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()),
                StatusOrder.PROCESSING);

        System.out.println(order.toString());

        StatusOrder os1 = StatusOrder.DELIVERED;
        StatusOrder os2 = StatusOrder.valueOf("DELIVERED");

        System.out.println(os2);
    }
}