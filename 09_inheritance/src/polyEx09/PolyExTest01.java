package polyEx09;

public class PolyExTest01 {

	public static void main(String[] args) {
	Pet pet = new Dog("포유류","흰색");
	pet.sound();
	pet.pattern();
	String kind = pet.getKind();
	System.out.println(kind);
	pet.getColor();
	pet.infor();
	System.out.println(pet);
	Pet pet1 = new Frog("양서류","녹색 계열");
	pet1.sound();
	pet1.pattern();
	String kind1 = pet.getKind();
	System.out.println(kind1);
	pet1.getColor();
	pet1.infor();
	System.out.println(pet);
	}

}
