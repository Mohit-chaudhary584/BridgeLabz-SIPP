class MobilePhone{
	String brand;
	String model;
	int price;

	public MobilePhone(String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void display(){
		System.out.println("Brand Name: " + brand + "\nModel Name: " + model + "Price: " + price);
	}

	public static void main(String[] args){
		MobilePhone phone1 = new MobilePhone("Samsung", "A33", 33000);
		MobilePhone phone2 = new MobilePhone("Apple", "14s", 100000);
		phone1.display();
		System.out.println("----------------------");
		phone2.display();
	}
}