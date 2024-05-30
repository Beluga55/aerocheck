import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class CheckIn {
    private String id;
    private Date dateTime;
    private String checkInMode;

    // Constructor
    public CheckIn(String id, Date dateTime, String checkInMode) {
        this.id = id;
        this.dateTime = dateTime;
        this.checkInMode = checkInMode;
    }

    // Check in Process (Single Passenger)
    public BoardingPass processCheckIn(Passenger passenger) {
        passenger.checkIn();
        BoardingPass boardingPass = new BoardingPass(passenger, passenger.getFlight(), generateSeatNumber());
        System.out.println("Boarding pass issued for passenger: " + passenger.getName());
        return boardingPass;
    }

    // Check in Process (Group)
    public List<BoardingPass> processCheckIn(Group group) {
        group.checkIn();
        List<BoardingPass> boardingPasses = new ArrayList<>();
        for(Passenger passenger : group.getPassengers()) {
            boardingPasses.add(new BoardingPass(passenger, passenger.getFlight(), generateSeatNumber()));
            System.out.println("Boarding pass issued for passenger: " + passenger.getName());
        }
        return boardingPasses;
    }

    // Generate Seat Number
    private String generateSeatNumber() {
        // Simple seat number generation logic
        return "A" + (int)(Math.random() * 100 + 1);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getCheckInMode() {
        return checkInMode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setCheckInMode(String checkInMode) {
        this.checkInMode = checkInMode;
    }
}
