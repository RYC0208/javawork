package Array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_향상된for문08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = {1,2,3,4,5,};
		
		for(int result : num) {
			System.out.println(result);
		}
		String name[] = {"홍길동","아무개","이리온"};
		String name2[] = new String[3];
		int index = 0;
		
		System.out.println("==============================================================================");
		for(String result2 : name){
			name2[index++] = result2;
			System.out.println(name2[index-1]);
		}System.out.println(Arrays.toString(name2));
		
		//0~100까지의 숫자중 하나를 입력 받고 그 숫자가 나올때 까지 출력
		int num1[] = new int[100];
		for(int i=0; i<num1.length; i++) {
			System.out.println("숫자를 입력:");
			int n1 = 
			
		}
	
	}

}
