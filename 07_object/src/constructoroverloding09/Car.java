package constructoroverloding09;

public class Car {

	String company;
	String model;
	String color;
	int speed;
	/*/
	 * 생성자 오버로딩
	 * this() -> 다른 생성자 호출( 매개변수의 갯수와 자료형이 같은 생성자를 찾아감)
	 */

	Car(){
		this("삼성","SM5","흰색");
		System.out.println("매개 변수 0개");
	}Car(String company){
		this(company,null, null);
		System.out.println("매개 변수 1개");
		
		
	}Car(String company, String model){
		
		this(company, model, "흰색");
		System.out.println("매개 변수 2개");
		
	}	Car(String company, String model, String color){
		System.out.println("매개 변수 3개");
		
		this.company =company;
		this.model = model;
		this.color = color;
	}
}
