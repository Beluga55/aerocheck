public class Baggage {
    private String id;
    private double weight;
    private boolean isChecked;

    // Constructor
    public Baggage(String id, double weight) {
        this.id = id;
        this.weight = weight;
        this.isChecked = false;
    }

    // Generate a tag for the baggage
    public void generateTag() {
        System.out.println("Tag generated for baggage with ID: " + id);
    }

    // Check the baggage
    public void check() {
        isChecked = true;
        generateTag();
        System.out.println("Baggage with ID: " + id + " is checked.");
    }

    // Getter and setters
    public String getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
