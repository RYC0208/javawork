package object01;

import java.util.Date;


public class GetClass05 {

	public static void main(String[] args) {		
		Card c1 = new Card("HEART",9);
		
		try {
			Card c2 = Card.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Class 객체를 통해서 객체 생성
		
		Class cObj = new Card().getClass();//재정의한 것은 가져오지 않음
		Class cObj2 = c1.getClass();//객체를 얻어 오는것 )잘 사용하진 않음
		
		try {
			Class cObj3 = Card.class.forName("Card");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c1);
		System.out.println(cObj.getName());
		System.out.println(cObj.toString());
		
		System.out.println(cObj2.getName());
		System.out.println(cObj2.toString());
	}

}
