package polyEx09;

public class Dog extends Pet {

	
	Dog(String kind, String color) {
		super("포유류","여러가지 색");
		
		

	}@Override 
	void sound(){
		System.out.println("멍멍, 왈왈 등");
		

	}@Override 
	void pattern(){
		System.out.println("털, 똑똑함, 크기가 다양함");
	}

}
