package Singleton15;

// 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
// 실행클래스에서 객체를 만들지 못하도록 해야 함
class Singleton {
	// 인스턴스 필드
	/*private  Singleton singleton; = new Singleton();*/
	// 정적 필드
	private static Singleton singleton = new Singleton();
	// 생성자에 Private 를 붙여 객채를 생성할 수 없게 만듦
	private Singleton() {}
	// 인스턴스 메소드 : 현재 메소드가 호출 되었다는 것은 객체가 이미 생성되었다는 의미
	/*	Singleton getinstance1() {
			System.out.println(singleton1);
			
			return singleton2;*/
	static Singleton getinstance() {
		 return singleton;
	}
	// 정적 메소드

 }

public class SingletonTest15 {

	public static void main(String[] args) {
		/*Singleton s1 = new Singleton(); new 사용 불가 */
		Singleton sing1 = Singleton.getinstance();
		Singleton sing2 = Singleton.getinstance();
		
		if(sing1 == sing2) 
			System.out.println("같은 객체를 가르키고 있음");
		else
			System.out.println("같은 객체를 가르키지 않음");
	}

}
