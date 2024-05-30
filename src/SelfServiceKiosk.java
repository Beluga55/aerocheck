import java.util.Date;

public class SelfServiceKiosk {
    private String id;

    // Constructor
    public SelfServiceKiosk(String id) {
        this.id = id;
    }

    // Check In (Single Passenger)
    public void checkIn(Passenger passenger) {
        System.out.println("Passenger " + passenger.getName() + " is checked in using kiosk " + id);
        CheckIn checkIn = new CheckIn("CI" + System.currentTimeMillis(), new Date(), "Kiosk");
        checkIn.processCheckIn(passenger);
    }

    // Check In (Group of Passengers)
    public void checkIn(Passenger[] passengers) {
        for (Passenger passenger : passengers) {
            System.out.println("Passenger " + passenger.getName() + " is checked in using kiosk " + id);
            CheckIn checkIn = new CheckIn("CI" + System.currentTimeMillis(), new Date(), "Kiosk");
            checkIn.processCheckIn(passenger);
        }
    }

    // Getter and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
