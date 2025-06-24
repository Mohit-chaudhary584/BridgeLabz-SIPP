class Circle{
	int radius;
	
	public Circle(){
		this(40);
		System.out.println("Default: "+radius);

	}
	public Circle(int radius){
		this.radius = radius;
		System.out.println(radius);
	}
	
	public static void main(String[] args){
		Circle circle = new Circle();
		Circle circle_2 = new Circle(20);
		

	}

}