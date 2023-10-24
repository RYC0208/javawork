package Array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_etc02 {

	public static void main(String[] args) {
		char charr[] = { 'a', 'b', 'c', 'd', 'e' };
		String strarr[] = { "홍길동", "kim", "$%^" };
		boolean barr[] = { true, false, false, true };
		double darr[] = { 3.14, 7.589, 46.345 };
		String sarr[] = new String[3];
		sarr[0] = "아무개";
		sarr[1] = "강남길";
		sarr[2] = "이순징";
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<sarr.length; i++) {
			System.out.print((i+1)+"번째 이름 입력: ");
			sarr [i] = scan.next();
			
		}for(int i=0; i<sarr.length; i++) {
			System.out.print(sarr[i]+", ");
		}
		System.out.println(); // 미리 만들어 놓은 클래스 등을 라이브러리 라고 함
		System.out.println(Arrays.toString(sarr));
		System.out.println(Arrays.toString(barr));
		
		System.out.println(Arrays.toString(charr)); //char일때만 값 출력
		int iarr[] = { 1, 2, 3, 4, 5 };
		System.out.println(iarr); // 주소 출력
		System.out.println(darr);
	}

}
