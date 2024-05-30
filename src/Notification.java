import java.util.Date;

public class Notification {
    private String id;
    private String message;
    private Date timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = new Date();
        this.id = generateId();
    }

    private String generateId() {
        return "NT" + System.currentTimeMillis();
    }

    public void send(Passenger passenger) {
        System.out.println("Sending notification to: " + passenger.getName());
        passenger.receiveNotification(this);
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public String getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
