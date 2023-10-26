package ex02;

public class Car {

	// 필드
 public String company = "기아";
	String model = "k7";
	String color = "Black";
	final int MAX_SPEED = 250;
	int speed;
	boolean run ; //false
	
	// 메소드
	public void run(){
		run = !run;
		if(run)
			System.out.println("출발합니다. 붕붕붕붕");
		else
			System.out.println("운행을 중지합니다.");
		
	}
	/*	int speedup() {
			++speed;
			return speed;
		}
		int speeddown() {
			--speed;
			return speed;
		}
		*/
	int speedup(int speed) {
		this.speed = speed;
		return this.speed;
	}
	int speeddown(int speed) {
		this.speed = speed;
		return this.speed;
	}
	
}
