
public class SpecialNeedsPassenger extends Passenger {
    private boolean specialAssistanceRequired;

    // Constructor
    public SpecialNeedsPassenger(String id, String name, String passportNumber, boolean specialAssistanceRequired) {
        super(id, name, passportNumber);
        this.specialAssistanceRequired = false;
    }

    // Request Special Assistance
    public void requestSpecialAssistance() {
        this.specialAssistanceRequired = true;
        System.out.println("Special assistance requested for passenger " + getName());
    }

    // Getters and Setters
    public boolean getSpecialAssistanceRequired() {
        return specialAssistanceRequired;
    }

    public void setSpecialAssistanceRequired(boolean specialAssistanceRequired) {
        this.specialAssistanceRequired = specialAssistanceRequired;
    }
}
