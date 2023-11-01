package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch07 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요");
		
	int sum = 0;
		
	for(int i=1; i<=3; i++) {
		System.out.println(i+"번째 점수: ");
		try{int num = sc.nextInt();
		sum+=num;
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다 다시 입력하세요");
			sc.next();
			i--;
		} 
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/3.0);
	}
}
