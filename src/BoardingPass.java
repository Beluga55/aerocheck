import java.util.Date;

public class BoardingPass {
    private String id;
    private Passenger passenger;
    private Flight flight;
    private String seatNumber;
    private Date issueDate;

    // Constructor
    public BoardingPass(Passenger passenger, Flight flight, String seatNumber) {
        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
        this.issueDate = new Date();
        this.id = generateId();
    }

    // Generate Id
    private String generateId() {
        return "BP" + System.currentTimeMillis();
    }

    // Display method for boarding pass
    public void displayBoardingPass() {
        System.out.println("Boarding Pass");
        System.out.println("ID: " + id);
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Flight: " + flight.getFlightNumber());
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Issue Date: " + issueDate);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}
