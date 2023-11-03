package string04;

import java.util.Arrays;
import java.util.Scanner;

public class String07 {

	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		String str = new String(bytes);//bytes를 문자로 반환 시켜줌
		System.out.println(str);
		
		String str2 = new String(bytes,6 , 4); // (객체,시작하는 인덱스 번호, 글자 수)
		System.out.println(str2);
		
		String str3 = "abcdefg";
		char ch = str3.charAt(3);
		System.out.println(ch);
		
		String upca = str3.toUpperCase();
		System.out.println(upca);
		
	int indexCD =	str3.indexOf('c');
	int indexD =	str3.indexOf('d');
	System.out.println(indexCD);
	System.out.println(indexD);
	
	String bookName = "자바 프로그램";
	
	if(bookName.indexOf("자바")>-1)
		System.out.println("자바 책 입니다");
	else 
		System.out.println("자바 책이 아닙니다");
	
	//concat(String): 2개의 문자열 연결
	String str4 = "java";
	String str5 = str4.concat(" program");
	System.out.println(str4+" program");
	
	String str6 = str4 + " program";//이거나 저거나 똑같아서 굳이 concat 은 안쓰는듯
	boolean re = str6.contains("java");
	System.out.println(re);
	
	//replace(cha old, char newChar) : 글자를 변경하여 문자열로 반환
	str5.replace('a', 'e'); // 바로 출력해도 됨
	System.out.println(str5.replace('a', 'e'));
	
// split(String regex) : regex를 기준으로 나누어 배열로 반환
	String str7 = "Cat/Dog/Brar";
	String[] strArr = str7.split("/");
	System.out.println(Arrays.toString(strArr));
	System.out.println(strArr[1]);
	
	String[] strArr2 = str7.split("/", 3);
	System.out.println(Arrays.toString(strArr2));
	System.out.println(strArr2[1]);
	
	//substring(int index) : index를 기준으로 글자를 나눔
	//EndIndex 바로 직전까지 얻어옴
	String str8 = "JavaOracleSpringBoot";
	System.out.println(str8.substring(4, 10));
	System.out.println(str8.substring(4));
	Scanner sc = new Scanner(System.in);
	System.out.println("주민번호를 입력하세요 ex)123456-1234567: ");
	String str9 = sc.nextLine();
	System.out.println(str9.substring(0,8)+"******");
	//저장할땐 String 객체를 하나 생성해서 str9.substring+"******"를 넣어주면 됨.
	
	//trim() : 앞,뒤의 공백제거
	String Trim = "     kim    ";
	System.out.println(Trim.trim());
}


	}


