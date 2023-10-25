package objex08;

public class Car {
	//필드
	String company;
	String model;
	String color;
	boolean run;
	int speed;
	final int MAX_SPEED = 200;
	
	
	Car(String company,  String model, String color){
		System.out.println("생성자 호출!");
		this.company=company;
		this.model=model;
		this.color=color;
	}
		//메소드
	void run(){
		
		run = !run;
		if(run) 
			System.out.println("시동이 켜짐");
			else
				System.out.println("시동이 꺼짐");		
	}
	
	int speedup(int speed) {
		this.speed = speed;
		return this.speed;
	}int speeddown(int speed){
		this.speed = speed;
	    return this.speed;
		
		
	}
}