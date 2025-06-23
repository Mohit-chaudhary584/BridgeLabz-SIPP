class Circle{
	int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public float area(){
		return 3.14f * radius * radius;
	}
	public void display(){
		float area = area();
		System.out.println("The area of circle with radius " + radius + " is " + area);
	}
	public static void main(String[] args){
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(10);
		circle1.display();
		System.out.println("------------------------------------------------");
		circle2.display();
	}
}