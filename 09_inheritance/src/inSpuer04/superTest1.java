package inSpuer04;
//	super. 이 붙으면 부모 클래스를 가져옴, this.이 붙으면 하위 클래스, 아무것도 안붙으면 가장 가까운걸 가져옴
class Parent2{
	int x = 10;
	void display() {
		System.out.println("부모 클래스의 display() 메소드");
	}
}
class Child2 extends Parent2{
	int x = 20;
	
	void method() {
		display();
		super.display();
		System.out.println("x="+x);		
		System.out.println("x="+this.x);
		System.out.println("x="+super.x);
	}void display() {
		System.out.println("자식 클래스의 display() 메소드");
	}
}

public class superTest1 {

	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.method();
		ch2.display();
		
	}

}
