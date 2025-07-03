public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 2500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Mohit", "Motorcycle");
        Vehicle v2 = new Vehicle("Aanya", "Sedan");

        System.out.println("Before updating registration fee:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating registration fee...\n");
        Vehicle.updateRegistrationFee(3000.0);

        System.out.println("\nAfter update:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}