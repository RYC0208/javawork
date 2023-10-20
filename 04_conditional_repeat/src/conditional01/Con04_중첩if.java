package conditional01;

import java.util.Scanner;

public class Con04_중첩if {

	public static void main(String[] args) {
		int num1 = -7; 
		
		if(num1 > 100) 
		{//100보다 큰 수 모두
			
		 if(num1>200) // 200보다 큰 수 모두
			 System.out.println("200보다 큰 숫자");
		 else //100~200
			 System.out.println("100보다 크고, 200과 같거나 작은 수");
		}
		
		else 
		{//100보다 작은 수 모두
			if(num1>0)//100~1
			System.out.println("100보다 작은 양수");
			else if(num1 == 0) //0
				System.out.println("0이다");
			else if(num1 < 0)//음수
				System.out.println("음수");
			
			
		}

	}
}
