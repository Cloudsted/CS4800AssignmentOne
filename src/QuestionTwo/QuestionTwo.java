package QuestionTwo;

public class QuestionTwo {
	   public static void main(String[] args) {
	        // Static array of Ship with size 3
	        Ship[] ships = new Ship[3];

	        // Dynamically initiate array elements with Ship, CruiseShip, and CargoShip objects
	        ships[0] = new Ship("Lusitania", "1906");
	        ships[1] = new CruiseShip("Titanic", "1912", 3327);
	        ships[2] = new CargoShip("Santa Maria", "1492", 1000);

	        // Loop that iterates through the array calling each object's print function
	        for (Ship ship : ships) {
	            ship.print();
	        }
	    }
}
