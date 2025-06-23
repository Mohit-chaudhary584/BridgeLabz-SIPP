class Employee{
	String name;
	int id;
	int salary;
	
	public Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display(){
		System.out.println("Employee Name: " + name + "\nEmployee Id: " + id + "\nEmployee Salary: " + salary);
	}
	public static void main(String[] args){
		Employee employee1 = new Employee("abc",1,20000);
		Employee employee2 = new Employee("def",2,25000); 
		employee1.display();
		System.out.println("----------------------");
		employee2.display();

	}
}
