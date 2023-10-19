package casting03;

public class Ch01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		
		int in1 = b1;
		
		short s1 = b1;
		
		in1 = s1;
		
		System.out.println(in1);
		
		double d1 = in1;
		System.out.println(d1);
		
		char ch1 = 'A';
		int in2 = ch1;
		System.out.println("영문자 'A'의 유니코드 : " + in2);
		
		char ch2 = '김';
		int in3 = ch2;
		System.out.println("한글 \"김\"의의 유니코드 : " + in3);
		
		
	}

}
