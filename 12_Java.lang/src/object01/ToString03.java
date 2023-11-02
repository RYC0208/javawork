package object01;

import java.util.Date;

class Card{
	String kind;
	int number;
	Card(){
this("Diamond", 5);
	}
	Card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	@Override
	public String toString() {
		return "kind: "+ kind + ", number: "+number;
	}
}
public class ToString03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART",9);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//toString을 오버라이딩 해주었다면
		//굳이 c1.toString을 안해도
		//오버라이딩한 메소드의 지정한 값이 c1으로 출력됨
		System.out.println(c1);
		
		//String , Date 클래스는 toString() 오버라이딩 되어 있다.
		String str = new String("korea");
		Date today = new Date();
		System.out.println(str);
		System.out.println(today);

	}

}
