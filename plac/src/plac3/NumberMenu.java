package plac3;

import java.util.Scanner;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);

	public  void menu() {
		try {
		System.out.println("첫번째 숫자를 입력: ");
		int num1 = sc.nextInt();
	
		System.out.println("두번째 숫자를 입력: ");
		int num2 = sc.nextInt();
		NumberController numberController = new NumberController();
		boolean result = numberController.check(num1, num2);
		}catch (Exception e) {
            System.err.println("예외 :" + e.getMessage());
 
		}
/*		for(int i=0; i<num1*num2;i++) {
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
			break;*/
	
	}
}

