package objConstructor07;

public class Car {
	
	
	
					//String 의 기본값 null, int = 0 boolean = false
	String company;   // 1 기본값(null) , 2 명시적 초기화, 3 초기화 블럭(클래스에서만 사용) 4 생성자 초기화
	String model;
	String color;
	int speed;
	{
		company = "대우";
				model = "kgkkgk";
				color = "white";
				speed = 1;
	}
	
	
	Car(String company, String model, String color){
		System.out.println("생성자 호출");
		
		this.company =company;
		this.model = model;
		this.color = color;
	}
}
