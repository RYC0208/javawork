package polymorphism07;

public class CarText {

	public static void main(String[] args) {
		Car car = null;
		FireCar c1 = new FireCar("2023 E9","Green");
		FireCar c2 = new FireCar();
		
		c1.getpower();
		
		c1.water();
		
		c1.speedup();
		c1.speedup();
		c1.speedup();
		
		c1.speeddown();
		
		System.out.println(c1.infor());
		System.out.println(c2.infor());
		//다형성 : 호출은 같은 이름이지만 어떤 객체가 있느냐에 따라 값이 달라짐
		//자동형변환: 자손타입을 부모타입으로 형변환
		System.out.println("___________________");
		
		car = c1;
		System.out.println(car.infor());
		car = c2;
		System.out.println(car.infor());
		//강제형변환: 부모타입을 자손타입으로 형변환
		FireCar c3 = null;
		c3 = (FireCar)car; // 자식타입으로 객체를 생성 -> Car타입으로 형변환 -> 자식타입으로 형변환
		
		Car car2 = new Car();
	
		//형변환 불가
	//	c2 = car2; //Car타입으로 생성(Car객체), 자식 개체로 변환(자식객체,Car객체)
		
	}

}
