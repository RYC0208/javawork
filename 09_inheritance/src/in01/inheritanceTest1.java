package in01;
//상속은 1개만 가능하다
class A{
	int aa=1;

}
class B extends A{
	int bb = 2;
}
class C extends B{
	int cc = 3;
}
public class inheritanceTest1 {

	public static void main(String[] args) {
		C objc = new C();
		System.out.println("C 클래스 객체에서 aa속성 값: " + objc.aa);
		System.out.println("C 클래스 객체에서 bb속성 값: " + objc.bb);
		System.out.println("C 클래스 객체에서 cc속성 값: " + objc.cc);
		
		B objb = new B();
		System.out.println("B 클래스 객체에서 aa속성 값: " + objb.aa);
		System.out.println("B 클래스 객체에서 bb속성 값: " + objb.bb);
		// B클래스로 생성된 객체는 상속 클래스인  C클래스의 cc는 사용 불가
		//System.out.println("B 클래스 객체에서 cc속성 값: " + objb.cc);
		
		
		A obja = new C();
		System.out.println("A 클래스 객체에서 aa속성 값: " + obja.aa);
		//System.out.println("A 클래스 객체에서 bb속성 값: " + obja.bb);
		//System.out.println("A 클래스 객체에서 cc속성 값: " + obja.cc);
		//B클래스와 마찬가지로 상속된 클래스를 사용할 수 없음!!!!!!!
		
	}

}
