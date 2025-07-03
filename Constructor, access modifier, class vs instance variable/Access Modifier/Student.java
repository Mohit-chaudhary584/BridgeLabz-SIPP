public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Mohit Sharma", 8.5);
        s.displayStudentDetails();

        System.out.println("\nUpdating CGPA...");
        s.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s.getCGPA());
    }
}