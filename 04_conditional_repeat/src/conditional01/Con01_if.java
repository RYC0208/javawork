package conditional01;

import java.util.Scanner;

public class Con01_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// if(조건식)
		//     조건식이 참일 때 실행
		
		int num1 = sc.nextInt();
		
		
		if(num1 >= 80)// 실행문이 하나일 때 			중괄호를 {}<< 생략해도 된다.
			System.out.println("100 입니다.");
		System.out.println("if문과 상관없이 실행됨");
		
		
		if(num1 < 79) {//실행문이 하나 이상일 때에는 반드시 중괄호를 넣는다.
			System.out.println("합격입니다");
			
			//중괄호가 없을 때에는 if문과 상관없음 
		    System.out.println("축하해");
		}
		System.out.println("if문과 상관없이 실행됨");
			
	    
	}

}
