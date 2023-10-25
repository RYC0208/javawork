package objex08;

public class Cartext {

	public static void main(String[] args) {
 Car car1 = new Car("벤츠", "A6", "White") ;
		 System.out.println("회사: "+car1.company);
		 System.out.println("모델: "+car1.model);
		 System.out.println("색상: "+car1.color);
		 car1.run();
		 
		 String all =car1.company +" "+ car1.model;
		 
		 System.out.println("현재 "+all+"의 "+"속도: "+car1.speedup(10));
		 System.out.println("현재 "+all+"의 "+"속도: "+car1.speedup(20));
		 System.out.println("현재 "+all+"의 "+"속도: "+car1.speedup(30));
		 System.out.println("현재 "+all+"의 "+"속도: "+car1.speeddown(20));
		 System.out.println("현재 "+all+"의 "+"속도: "+car1.speeddown(10));
		 System.out.println("현재 "+all+"의 "+"속도: "+car1.speeddown(0));
		 car1.run();
	}

}
