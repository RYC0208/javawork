package op01;

import java.util.Scanner;

public class Ch04_logical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//논리합과 논리곱
		/*
		 * x   y  논리합(&&)   논리곱(||) , 논리곱: 둘중에 하나만 참이어도 참 , 논리합: 둘중에 하나라도 거짓이면 거짓
		 * 0   0     0         0
		 * 0   1     0         1    
		 * 1   0     0         1
		 * 1   1     1         1
		 */
		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1 > num2 && num1 < num2;
	    System.out.println(re1);
	    
	    re1 = num1 > num2 || num1 < num2;
        System.out.println(re1);
        System.out.println("-----------");
        // ! : not
        boolean b1 = num1 >= num2;
        boolean re2 = !b1;
        System.out.println(b1);
        System.out.println("-----------");
        
        //A: 65  a : 97  z:122
        char ch1 = 'K';
        System.out.println("문자를 입력하세요 : ");
        
        char ho = scan.next().charAt(0);
        
        
        System.out.println("소문자 인가?"+(ho > 'a'&& ho<'z'));
        System.out.println("대문자 인가?"+(ho >= 'A'&& ho<='Z'));
        
	}

}
