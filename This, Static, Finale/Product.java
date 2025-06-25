public class Product {

    	// Static variable shared by all product instances

    	static double discount = 10.0; 

    	// Final productID prevents mutability

    	final int productID;
    	String productName;
    	double price;
    	int quantity;

    	// Constructor using 'this' to initialize instance variables

    	public Product(int productID, String productName, double price, int quantity) {
        	this.productID = productID;
        	this.productName = productName;
        	this.price = price;
        	this.quantity = quantity;
    	}

    	// Static method to update discount

    	public static void updateDiscount(double newDiscount) {
        	discount = newDiscount;
        	System.out.println("Updated Discount: " + discount + "%");
    	}

    	// Method to display product details with instanceof check

    	public void displayDetails() {
        	if (this instanceof Product) {
            		System.out.println("Product ID: " + productID);
            		System.out.println("Name: " + productName);
            		System.out.println("Price: $" + price);
            		System.out.println("Quantity: " + quantity);
            		System.out.println("Current Discount: " + discount + "%");
        	} else {
            		System.out.println("Invalid product object.");
        	}
    	}

    	// Main method
 
    	public static void main(String[] args) {
        	Product p1 = new Product(1, "xyz", 15.0, 2);
        	Product p2 = new Product(2, "pqr", 200.0, 3);

        	p1.displayDetails();
        	System.out.println("----------------------");
        	p2.displayDetails();

        	// Update discount for all products
        	System.out.println("\nApplying new discount...");
        	Product.updateDiscount(15.0);

        	System.out.println("\nRe-displaying product details after discount update:");
        	p1.displayDetails();
    	}
}