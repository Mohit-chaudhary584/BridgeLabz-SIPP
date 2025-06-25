public class Student {

    	// Static variable for university name shared by all students

    	static String universityName = "GLA University";
    	private static int totalStudents = 0;

    	// Final variable to ensure rollNumber cannot be changed

    	final int rollNumber;
    
	String name;
    	String grade;

    	// Constructor using 'this' for initialization

    	public Student(String name, int rollNumber, String grade) {
        	this.name = name;
        	this.rollNumber = rollNumber;
        	this.grade = grade;
        	totalStudents++;
    	}

    	// Static method to display total students enrolled

    	public static void displayTotalStudents() {
        	System.out.println("Total Students Enrolled: " + totalStudents);
    	}

    	// Method to update the grade only if instance is valid

    	public void updateGrade(String newGrade) {
        	if (this instanceof Student) {
            		this.grade = newGrade;
            		System.out.println("Grade updated to: " + this.grade);
        	} else {
            		System.out.println("Invalid student object. Cannot update grade.");
        	}
    	}

    	// Method to display student details with instanceof check

    	public void displayDetails() {
        	if (this instanceof Student) {
            		System.out.println("University: " + universityName);
            		System.out.println("Name: " + name);
            		System.out.println("Roll Number: " + rollNumber);
            		System.out.println("Grade: " + grade);
        	} else {
            		System.out.println("Invalid student object.");
        	}
    	}

    	// Main method

    	public static void main(String[] args) {
        	Student s1 = new Student("abc", 101, "A");
        	Student s2 = new Student("def", 102, "B+");

        	s1.displayDetails();
        	System.out.println("--------------------");
        	s2.displayDetails();

        	System.out.println();
        	displayTotalStudents();

        	System.out.println("\nUpdating grade for Aria...");
        	s1.updateGrade("A+");
        	s1.displayDetails();
    	}
}