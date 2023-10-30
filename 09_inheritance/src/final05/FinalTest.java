package final05;
//클래스에 final 을 붙이면 상속할 수 없음
final class Final01{
	
}

/*
class FinalInher extends Final01{
	
}*/
class final02{
	int num = 10;
	// 변수 앞에 final을 붙이면 상수가 됨, 값이 한 번 저장되면 변경 불가함
	final int NUM2 = 20;
	// 메소드 앞에 final을 붙이면 오버라이딩 불가
 final int play() {
	 // NUM2 = 40;과 같이 상수가 된 NUM2의 값을 변경 할 수 없
	 return NUM2;
 }
 int show() {
	 return num;
 }
}
class Final02Infer extends final02{
//메소드 재정의 불가
	/*
	int play() {
		return 3;
	}*/
	@Override
	int show() {
		return 3;
	}
}
public class FinalTest {

	public static void main(String[] args) {

	}

}
