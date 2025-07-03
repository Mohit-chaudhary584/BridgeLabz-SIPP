public class Course {
    private String courseName;
    private int duration; // in weeks or months
    private double fee;
    private static String instituteName = "Tech Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 5000.00);
        Course c2 = new Course("Web Development", 12, 8000.00);

        System.out.println("Before update:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println("\nUpdating institute name...\n");
        Course.updateInstituteName("CodeX Institute");

        System.out.println("After update:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}