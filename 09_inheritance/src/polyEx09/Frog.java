package polyEx09;

public class Frog extends Pet {

	Frog(String kind, String color) {
		super("양서류", "초록 계열");
		
	}void sound(String sound){
		System.out.println("개굴개굴");
	}void pattern(String pattern){
		System.out.println("점프력 goat");

	}
	@Override 
	public String toString() {
		 return "개구리";
}
}