package interface04;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println("----------------------");
		
		myCar.BackLeftTire = new HankookTire();
		myCar.run();
		
		
		
		
		
	}
	

}
