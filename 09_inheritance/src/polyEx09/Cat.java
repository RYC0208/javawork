package polyEx09;

public class Cat extends Pet {

	Cat(String kind, String color) {
		super("포유류", "다양해 다양 다양");
		
	}@Override 
	void sound(){
		System.out.println("냐옹, 미야우, 냥");
	}@Override 
	void pattern(){
		System.out.println("털,날렵함,길에 자주 보임, 귀여움,최고, 포유류 goat");
	}

}
