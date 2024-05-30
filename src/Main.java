import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose check-in method:\n1. Service Kiosk\n2. Counter");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1 for Service Kiosk or 2 for Counter:");
            scanner.next();
        }
        int checkInMethod = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Choose check-in type:\n1. Individual\n2. Group");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1 for Individual or 2 for Group:");
            scanner.next();
        }
        int checkInType = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create a new flight
        Flight flight = new Flight("F1", "AA123", new Date(), new Date());

        // Create a list of passengers
        List<Passenger> passengers = new ArrayList<>();

        if (checkInType == 1) { // Individual check-in
            passengers.add(getPassengerDetails(scanner, flight));
        } else { // Group check-in
            System.out.println("Enter number of passengers in the group:");
            int numPassengers = scanner.nextInt();
            scanner.nextLine(); // consume newline
            for (int i = 0; i < numPassengers; i++) {
                passengers.add(getPassengerDetails(scanner, flight));
            }
        }

        // Create a group
        Group group = new Group("G1", passengers.get(0), passengers);

        // Check in process
        CheckIn checkIn = new CheckIn("CI001", new Date(), checkInMethod == 1 ? "Self-Service" : "Counter");

        // Check in and display boarding passes
        if (checkInType == 1) { // Individual check-in
            BoardingPass bp = checkIn.processCheckIn(passengers.get(0));
            bp.displayBoardingPass();
        } else { // Group check-in
            List<BoardingPass> bpGroup = checkIn.processCheckIn(group);
            for(BoardingPass bp : bpGroup) {
                bp.displayBoardingPass();
                System.out.println("--------------------");
            }
        }

        // Notifications
        Notification notification = new Notification("Your flight is been delayed");
        group.receiveNotification(notification);

        scanner.close();
    }

    private static Passenger getPassengerDetails(Scanner scanner, Flight flight) {
        System.out.println("Enter passenger ID:");
        String passengerId = scanner.nextLine();
        while (passengerId.isEmpty()) {
            System.out.println("Passenger ID cannot be empty. Please enter passenger ID:");
            passengerId = scanner.nextLine();
        }

        System.out.println("Enter passenger name:");
        String passengerName = scanner.nextLine();
        while (passengerName.isEmpty()) {
            System.out.println("Passenger name cannot be empty. Please enter passenger name:");
            passengerName = scanner.nextLine();
        }

        System.out.println("Enter passenger passport number:");
        String passportNumber = scanner.nextLine();
        while (passportNumber.isEmpty()) {
            System.out.println("Passport number cannot be empty. Please enter passport number:");
            passportNumber = scanner.nextLine();
        }

        System.out.println("Is this a special needs passenger? (yes/no)");
        String specialNeeds = scanner.nextLine();
        while (!specialNeeds.equalsIgnoreCase("yes") && !specialNeeds.equalsIgnoreCase("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no':");
            specialNeeds = scanner.nextLine();
        }

        Passenger passenger;
        if (specialNeeds.equalsIgnoreCase("yes")) {
            passenger = new SpecialNeedsPassenger(passengerId, passengerName, passportNumber, true);
        } else {
            passenger = new Passenger(passengerId, passengerName, passportNumber);
        }
        passenger.setFlight(flight);

        System.out.println("Enter baggage ID:");
        String baggageId = scanner.nextLine();
        while (baggageId.isEmpty()) {
            System.out.println("Baggage ID cannot be empty. Please enter baggage ID:");
            baggageId = scanner.nextLine();
        }

        System.out.println("Enter baggage weight:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number for baggage weight:");
            scanner.next();
        }
        double baggageWeight = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        Baggage baggage = new Baggage(baggageId, baggageWeight);
        passenger.addBaggage(baggage);

        return passenger;
    }
}