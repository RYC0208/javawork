package polymorphism06;

class A{
	int aa = 10;
}
class B extends A{
	int bb = 20;
}
class C extends A{
	int cc = 30;
}
class D extends C {
	int dd = 40;
}
class E extends B{
	int ee = 50;
}
public class PolymorphismTest1 {

	public static void main(String[] args) {
		B b1 = new B();
		A a1 = b1; //A 클래스로 형변환 : A클래스의 인스턴스 멤버만 사용 가능 :p
		a1.aa = 100;
		//a1.bb = 200; B클래스를 A클래스로 형변환 했기 때문에 B클래스를 사용 할 수 없음
		System.out.println(a1.aa);
		
		C c1 = new C();
		a1=c1;
		System.out.println(a1.aa);
		
		D d1 = new D();
		C c2 = d1;
		
		c2.cc =300;
		c2.aa = 1000;
		A a2 = d1;
		a2.aa = 10000;
		
		E e1 = new E();
		A a3 = e1; // A클래스로 형변환 하면 A클래스만 사용 가능
		B b3 = e1;// B클래스와 A클래스의 멤버 사용가능
		
		//a2.cc = 32; 형변환이 이루어졌기 때문에 C 클래스 사용 불가
	}

}
