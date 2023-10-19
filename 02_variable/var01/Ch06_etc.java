package var01;

public class Ch06_etc {

	public static void main(String[] args) {

    //정수:long, 실수:float
		int num1 = 1111111111;
		long long1 = 111111111234L; //숫자뒤에 L을 붙여서 long형임을 알린다
		float float1 = 2.12341f; //숫자뒤에 F를 붙여서 float형임을 알린다
		
		//자료형의 범위를 미리 만들어 놓은 클래스 사용
		System.out.println("byte크기 :" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short크기 :" + Short.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("int크기 : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("char크기 : " + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);

	}

}
