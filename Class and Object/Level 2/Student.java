class Student{
	String name;
	int rollNo;
	int[] marks;

	public Student(String name, int rollNo, int[] marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public String calculate(){
		int sum = 0;
		for(int mark : marks){
			sum += mark;
		}
		int average = sum / marks.length;
		String grade = "";
		if(average >= 90) grade = "O";
		if(average >= 80 && average < 90) grade = "A+";
		if(average >= 70 && average < 80) grade = "A";
		if(average >= 60 && average < 70) grade = "B+";
		if(average >= 50 && average < 60) grade = "B";
		if(average >= 40 && average < 50) grade = "C";
		if(average >= 30 && average < 40) grade = "D";
		if(average < 30) grade = "F";
		return grade;
	}

	public void display(){
		String grade = calculate();
		System.out.println("Student Name: " + name + "\nStudent Roll No.: " + rollNo + "\nStudent Grade: " + grade);
	}
	public static void main(String[] args){
		int[] marks1 = {40,50,60};
		int[] marks2 = {90, 99, 92};
		
		Student grade1 = new Student("abc",01,marks1);
		System.out.println("------------------------");
		Student grade2 = new Student("def",02,marks2);
		
		grade1.display();
		grade2.display();
	}
}