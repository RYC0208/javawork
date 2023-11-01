package Ex01;

import java.util.Scanner;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	private int num1;
	private int num2; 
	public  void check(int num1 , int num2) {
		System.out.println("첫번째 숫자를 입력: ");
		num1 = sc.nextInt();
		this.num1 =num1;
		System.out.println("두번째 숫자를 입력: ");
		num2 = sc.nextInt();
		this.num2 = num2;
		for(int i=0; i<num1*num2;i++) {
			int sum = 0;
			boolean or = true;
			sum += num2*i;
			System.out.println(sum);
			if (num1 == sum) {
				System.out.println(num1 +"은 "+ num2+"의 배수인가? "+!or);
				break;
			} else if(sum>100) {
			 System.out.println("예외");
			 break;
			
		}else
			System.out.println(num1 +"은 "+ num2+"의 배수인가? "+or);
			break;
	}
}
}
