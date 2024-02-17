package QuestionTwo;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Setter and Getter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Print function override
    @Override
    public void print() {
        System.out.println("Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tonnage");
    }
}
