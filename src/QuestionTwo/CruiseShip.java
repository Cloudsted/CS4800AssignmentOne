package QuestionTwo;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Setter and Getter
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Print function override
    @Override
    public void print() {
        System.out.println("Cruise Ship Name: " + getName() + ", Maximum Passengers: " + maxPassengers);
    }
}