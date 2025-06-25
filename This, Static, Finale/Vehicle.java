public class Vehicle {

	// Static variable shared by all vehicles
	
	static double registrationFee = 5000.0; // in INR

	// Final field to prevent registration number from changing
	
	final String registrationNumber;
	String ownerName;
	String vehicleType;

	// Constructor using 'this' keyword to initialize fields

	public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        	this.ownerName = ownerName;
        	this.vehicleType = vehicleType;
        	this.registrationNumber = registrationNumber;
    	}

    	// Static method to update the common registration fee
    	public static void updateRegistrationFee(double newFee) {
        	registrationFee = newFee;
        	System.out.println("Registration Fee updated to ₹" + registrationFee);
    	}

    	// Method to display vehicle details after instanceof check
    	public void displayDetails() {
        	if (this instanceof Vehicle) {
            		System.out.println("Owner Name: " + ownerName);
            		System.out.println("Vehicle Type: " + vehicleType);
            		System.out.println("Registration Number: " + registrationNumber);
            		System.out.println("Registration Fee: " + registrationFee);
        	} else {
            		System.out.println("Invalid Vehicle object.");
        	}
    }

    // Main method 
    	public static void main(String[] args) {
        	Vehicle v1 = new Vehicle("abc", "Car", "ABC1234");
        	Vehicle v2 = new Vehicle("def", "Scooter", "DEF1234");

        	v1.displayDetails();
        	System.out.println("----------------------");
        	v2.displayDetails();

        	System.out.println("\nUpdating registration fee...");
        	Vehicle.updateRegistrationFee(6000.0);

        	System.out.println("\nDisplaying details after fee update:");
        	v1.displayDetails();
    	}
}