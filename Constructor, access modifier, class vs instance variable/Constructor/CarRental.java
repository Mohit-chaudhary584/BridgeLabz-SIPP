public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 1200.0;

    public CarRental() {
        this.customerName = "Guest";
        this.carModel = "Generic";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Mohit", "Toyota Fortuner", 5);
        CarRental copiedRental = new CarRental(customRental);

        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        System.out.println("\nCustom Rental:");
        customRental.displayRentalDetails();

        System.out.println("\nCopied Rental:");
        copiedRental.displayRentalDetails();
    }
}