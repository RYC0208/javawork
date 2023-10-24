package repetitive;

import java.util.Scanner;

public class Re03_while {

	public static void main(String[] args) {

		// for문을 while문으로
		/*		int flag = 1; //초기값
				while(flag <=5 ) { //조건
					System.out.println("flag의 값은 "+flag);
					if(flag <= 5 )
						flag++;} // 증감식		
				int sum = 0;
				int i = 1;
				while(i <= 14) {
					 sum += i++;
						
						sum += i;
						i++;
					
				}
				System.out.println("1~100까지의 합: "+ sum);*/
		// 1~ 하나씩 증가하면서 합계를 낸다
		// 그 합이 100이상이 되는 순간 while문을 빠져 나온다
		// 합과 어디까지 더했을 때 100이 되었다면 그 숫자를 출력
		// break : 반복문을 빠져나온다 (for, while , do-while)
				int num1 = 1;
				int num2 = 1;
				while (num2 <= 10) {
					num2 += ++num1;
		
		
				}
				System.out.println("1~"+num1+"까지의 합 = "+num2);
		
			int count= 0;
			
			while(true) {
				System.out.println(++count); 
				if(count ==3)
					break;
			}
			Scanner sc = new Scanner(System.in);
		
			
			while(true) {
				System.out.println("'c'를 멈추려면 'q'를 입력하세요 :");
				char ch1 = sc.next().charAt(0);
				
				if(ch1 =='q')
					break;
			}
		System.out.println("종료");
		while(true)
		{
		System.out.println("연산 할 숫자와 연사자를 입력하시라(종료하려면 @를 입력) ex)+, 4, 9: ");
		char c1 = sc.next().charAt(0);
		int nu1 =sc.nextInt();
		int nu2 =sc.nextInt();
		
		if(c1=='@')
		break;
		System.out.println(nu1+""+c1+nu2+"="+(nu1+nu2));
			
			
		}
		System.out.println("종료");
	}

}
