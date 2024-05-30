import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Flight {
    private String id;
    private String flightNumber;
    private Date departureTime;
    private Date arrivalTime;
    private List<Passenger> passengers;

    // Constructor
    public Flight(String id, String flightNumber, Date departureTime, Date arrivalTime) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.passengers = new ArrayList<>();
    }

    // Add Passenger Methods
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Passenger " + passenger.getName() + " added to flight " + flightNumber);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
