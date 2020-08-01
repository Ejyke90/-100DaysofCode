package oop;

class Human {
	// the attributes, variables or properties of this human are:
	String name;
	String email;
	String phone;
	
	// the activities, actions, or adjectives of this human are:
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating and her email address is " + email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping, you can reach her on " + phone);
	}
}





public class Demo {

	public static void main(String[] args) {
		// first we instantiate an object
		
		Human human1 = new Human();
		
		// then we define some properties
		human1.name = "Ginika";
		human1.email = "sdn.net@gmail.com";
		human1.phone = "07303089786";
		
		// next is Abstraction
		human1.walk();
		human1.eat();
		human1.sleep();
		

	}

}
