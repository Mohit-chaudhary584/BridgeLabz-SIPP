class Item{
	int itemCode;
	String itemName;
	int price;
	int quantity;

	public Item(int itemCode, String itemName, int price, int quantity){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public int totalCost(){
		return quantity * price;
	}

	public void display(){
		int totalCost = totalCost();
		System.out.println("Item Code: " + itemCode + "\nItem Name: " + itemName + "\nPrice : " + price + "\nTotal Cost for " + quantity  + " units: " + totalCost);
	}
	
	public static void main(String[] args){
		Item item1 = new Item(001, "abc", 500, 5);
		Item item2 = new Item(002, "def", 550, 7);
		item1.display();
		System.out.println("--------------------");
		item2.display();

	}
}