import java.time.LocalDateTime;
import java.util.UUID;

public class Order {
    private UUID id;
    private LocalDateTime moment;
    private StatusOrder status;

    public Order(){}

    public Order(UUID id, LocalDateTime moment,  StatusOrder status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
