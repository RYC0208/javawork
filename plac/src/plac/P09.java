package plac;

import java.util.Arrays;
import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		/*	int[] num = new int [3];
			int in1 = 0;
			
			System.out.println("1번째 인덱스: ");
			int n1 = sc.nextInt();
			
			System.out.println("2번째 인덱스: ");
			int n2 = sc.nextInt();
			
			System.out.println("3번째 인덱스: ");
			int n3 = sc.nextInt();
		
			
			for(int i=0; i<num.length;i++) {
			num[0] = n1;
			num[1] = n2;
			num[2] = n3;
			in1 += num[i];
			}				System.out.println("1번째 인덱스에 넣을 값: "+n1);
			System.out.println("2번째 인덱스에 넣을 값: "+n2);
			System.out.println("3번째 인덱스에 넣을 값: "+n3);
			System.out.println(Arrays.toString(num));
			System.out.println("총합: "+ in1);
			*/
		

		
		while(true) {

			System.out.println("입력: ");
		
			int num1 = sc.nextInt();
			System.out.println("다시 입력: ");
			if(num1%2 != 0 && num1>=3) {
				int int1[] = new int[num1];
			int sum = 1;
			for(int i=0; i<int1.length;i++) {
				int1[i] += sum++;
				
			} 
			
		}
		 
		}
			 
		
	}

}
