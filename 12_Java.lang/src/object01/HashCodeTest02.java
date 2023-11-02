package object01;

public class HashCodeTest02 {

	public static void main(String[] args) {
		String str1 =new String("abc");//다른 주소를 갖고 있음
		String str2 =new String("abc");//다른 주소를 갖고 있음
		
	//	String str3 = ("def"); //같은 주소를 갖고 있음
	//	String str4 = ("def");//같은 주소를 갖고 있음
		
	//	str1 = "jjjj";//str1의 새 주소를 생성하고 str1은 "jjjj"의 주소를 가르키게 됨
	System.out.println(str1.equals(str2));//재정의
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	System.out.println(System.identityHashCode(str2));//고유의 코드
	System.out.println(System.identityHashCode(str1));
	
	}

}
