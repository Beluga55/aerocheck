import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String id;
    private String name;
    private String passportNumber;
    private boolean checkInStatus;
    private Flight flight;
    private List<Baggage> baggageList;
    private List<Notification> notifications;

    // Constructor
    public Passenger(String id, String name, String passportNumber) {
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
        this.checkInStatus = false;
        this.baggageList = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    // Passenger Check In
    public void checkIn() {
        this.checkInStatus = true;
        System.out.println("Passenger " + name + " has checked in.");
        System.out.println("--------------------");
    }

    // Passenger receives notification
    public void receiveNotification(Notification notification) {
        notifications.add(notification);
        System.out.println("Passenger " + name + " has received a notification.");
        System.out.println("--------------------");
    }

    // Passenger adds baggage
    public void addBaggage(Baggage baggage) {
        baggageList.add(baggage);
        System.out.println("Passenger " + name + " has added a baggage.");
        System.out.println("--------------------");
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public boolean getCheckInStatus() {
        return checkInStatus;
    }

    public Flight getFlight() {
        return flight;
    }

    public List<Baggage> getBaggageList() {
        return baggageList;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public void setBaggageList(List<Baggage> baggageList) {
        this.baggageList = baggageList;
    }

    public void setCheckInStatus(boolean checkInStatus) {
        this.checkInStatus = checkInStatus;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
