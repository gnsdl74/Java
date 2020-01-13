package edu.java.inherit04;

public class InheritMain04 {

	public static void main(String[] args) {
		Animal animal = new Animal("애완동물");
		animal.speak();
		
		System.out.println();
		Dog dog = new Dog("멍멍이", "믹스종");
		dog.speak();
		
		System.out.println();
		Cat cat = new Cat();
		cat.speak();
		
	}	// end main()

}	// end InheritMain04
