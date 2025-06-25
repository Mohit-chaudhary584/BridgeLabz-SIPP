public class Patient {

    // Static variable shared among all patients

    static String hospitalName = "ABC Hospital";
    static int totalPatients = 0;

    // Final variable to uniquely identify each patient

    final int patientID;

    String name;
    int age;
    String ailment;

    // Constructor using 'this' to initialize fields

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to display total patients admitted

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details with instanceof check

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    // Main method

    public static void main(String[] args) {
        Patient p1 = new Patient(101, "abc", 45, "Diabetes");
        Patient p2 = new Patient(102, "def", 30, "Migraine");

        p1.displayDetails();
        System.out.println("-------------------------");
        p2.displayDetails();

        System.out.println("-------------------------");
        Patient.getTotalPatients();
    }
}