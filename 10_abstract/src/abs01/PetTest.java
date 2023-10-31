package abs01;

public class PetTest {

	public static void main(String[] args) {
		//추상 클래스는 객체를 생성할 수 없음
		//Pet pet = new Pet("강아지, ", "흰색");
		Dog dog = new Dog("귀여운 색");
		Pet pet = new Dog("멋진 색");
	}

}
