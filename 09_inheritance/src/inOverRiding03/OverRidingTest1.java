package inOverRiding03;

class F {
	void show() {
		System.out.println("부모 클래스 show()메소드 호출");
	}
	void play(String title){
		System.out.println("부모 클래스에서"+ title+"을 플레이 합니다.");
	}
}
class G extends F{
	//오버라이딩:상위 클래스와 변수와 자료형이 같아야함
	@Override
	void show() {
		 System.out.println("자식 클래스 show()메소드 호출");
		 //오버로딩: 매개 변수의 갯수가 다르거나 자료형이 달라야 됨
} void play(int title) {
	System.out.println("자식 클래스에서"+title+"을 플레이 합니다.");
}
public class OverRidingTest1 {

	public static void main(String[] args) {
		G g = new G();
		System.out.println("Before show method");
		g.show();
		g.play(12);
		g.play("영화");
		
	}

	}

}
