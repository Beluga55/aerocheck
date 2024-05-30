import java.util.Date;

public class AirportStaff {
    private String id;
    private String name;

    // Constructor
    public AirportStaff(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Assist Check In (Counter Staff) (Single Passenger)
    public void assistCheckIn(Passenger passenger) {
        System.out.println("Passenger " + passenger.getName() + " is checked in by staff " + name);
        CheckIn checkIn = new CheckIn("CI" + System.currentTimeMillis(), new Date(), "Staff");
        checkIn.processCheckIn(passenger);
    }

    // Assist Check In (Counter Staff) (Group of Passengers)
    public void assistCheckIn(Passenger[] passengers) {
        for (Passenger passenger : passengers) {
            System.out.println("Passenger " + passenger.getName() + " is checked in by staff " + name);
            CheckIn checkIn = new CheckIn("CI" + System.currentTimeMillis(), new Date(), "Staff");
            checkIn.processCheckIn(passenger);
        }
    }

    // Getter and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
