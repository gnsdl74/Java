package edu.java.inner02;

public class InnerMain02 {

	public static void main(String[] args) {
		Car car1 = new Car("코나");
		Car.Tire tire1 = car1.new Tire(21);
		tire1.display();
		
		System.out.println();
		Car car2 = new Car("기블리");
		Car.Tire tire2 = car2.new Tire(25);
		tire2.display();
		
	} // end main()

} // end InnerMain02
