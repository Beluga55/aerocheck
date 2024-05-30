import java.util.List;

public class Group {
    private String id;
    private Passenger representative;
    private List<Passenger> passengers;

    // Constructor
    public Group(String id, Passenger representative, List<Passenger> passengers) {
        this.id = id;
        this.representative = representative;
        this.passengers = passengers;
    }

    // Group Check In
    public void checkIn() {
        for(Passenger passenger : passengers) {
            passenger.checkIn();
        }
        System.out.println("Group " + id + " has checked in.");
    }

    // Group receives notification
    public void receiveNotification(Notification notification) {
        for(Passenger passenger : passengers) {
            passenger.receiveNotification(notification);
        }
        System.out.println("Group " + id + " has received a notification.");
    }

    // Group adds baggage
    public void addBaggage(Baggage baggage) {
        for(Passenger passenger : passengers) {
            passenger.addBaggage(baggage);
        }
        System.out.println("Group " + id + " has added a baggage.");
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public Passenger getRepresentative() {
        return representative;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setRepresentative(Passenger representative) {
        this.representative = representative;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setId(String id) {
        this.id = id;
    }
}
