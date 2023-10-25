package ObjField02;

public class FieldTest {

	public static void main(String[] args) {
		Car car1 =new Car();
		String company = car1.company;
		System.out.println("Car1 회사명: "+ company);
		System.out.println("Car1 모델명: "+ car1.model);
		
		car1.model = "SM9";;
		System.out.println("Car1 모델명: "+car1.model);
		
		// car1.MAX_SPEED = 800; 상수는 한 번 값을 넣으면 변경 할 수 없돠
		car1.maxspeed = 800;
		System.out.println();
		
		Car car2 = new Car();
		System.out.println("car2 회사명: "+car2.company);
		System.out.println("car2 모델명명: "+car2.model);
	}
	

}
