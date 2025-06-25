public class Employee {

    	// Static variable shared across all employees

    	static String companyName = "ABC";
    	static int totalEmployees = 0;

    	// Final variable to prvent employee ID from overriding
    	final int id;
    	String name;
    	String designation;

    	// Constructor using 'this' to resolve ambiguity

    	public Employee(String name, int id, String designation) {
        	this.name = name;
        	this.id = id;
        	this.designation = designation;
        	totalEmployees++;
    	}

    	// Static method to display total employees

    	public static void displayTotalEmployees() {
        	System.out.println("Total Employees: " + totalEmployees);
    	}

    	// Method to display employee details after instanceof check

    	public void displayDetails() {
        	if (this instanceof Employee) {
            	System.out.println("Company: " + companyName);
            	System.out.println("Employee Name: " + name);
            	System.out.println("ID: " + id);
            	System.out.println("Designation: " + designation);
        	} else {
            	System.out.println("Invalid employee object.");
        	}
    	}

    	// Main method

    	public static void main(String[] args) {
        	Employee e1 = new Employee("abc", 101, "xyz");
        	Employee e2 = new Employee("def", 102, "pqr");

        	e1.displayDetails();
        	System.out.println("----------------------");
        	e2.displayDetails();
        	System.out.println("----------------------");
        	Employee.displayTotalEmployees();
    	}
}