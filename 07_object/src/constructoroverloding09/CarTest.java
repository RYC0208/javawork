package constructoroverloding09;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car("기아","k7","빨강") ;
				System.out.println(car1.company);
				System.out.println(car1.model);
				System.out.println(car1.color);
				
				System.out.println();
				
				Car car2 = new Car("현대","H1","노랑");
				System.out.println(car2.company);
				System.out.println(car2.model);
				System.out.println(car2.color);
				
		System.out.println("____________________");
		Car car3 = new Car();
		System.out.println("____________________");
		Car car4 = new Car("대우");
		Car car5 = new Car("BMW", "I8");
		Car car6 = new Car("삼성","sm7","흰색");
	}

}