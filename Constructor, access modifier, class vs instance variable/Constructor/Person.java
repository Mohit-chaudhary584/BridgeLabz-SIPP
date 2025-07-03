import java.util.*;
class Person{
	String name;
	float height;
	float weight;
	
	public Person(String name, float height, float weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
		System.out.println("Parameterized Constructor:");
		System.out.println("Person Name: " + name + "\nPerson Height: " + height + "\nPerson Weight: " + weight);

	}
	
	public Person(Person prev){
		this.name = prev.name;
		this.height = prev.height;
		this.weight = prev.weight;
		System.out.println("Parameterized Constructor:");
		System.out.println("Person Name: " + name + "\nPerson Height: " + height + "\nPerson Weight: " + weight);
	}

	public static void main(String[] args){
		Person p1 = new Person("abc",1.2f,1.3f);
		Person p2 = new Person(p1);

	}
}