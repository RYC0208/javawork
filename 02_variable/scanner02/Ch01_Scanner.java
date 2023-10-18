package scanner02;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class Ch01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("이름을 입력하세요 : ");

		// 문자열 단어로 입력 받을 때 : next()
		String name = scan.next();
		System.out.println("당신의 이름은 " + name);

		// 정수로 입력 받을 때 : nextint()
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age);

		// 실수로 입력 받을 때 : nextdouble()
		System.out.print("키를 소수점 2째 자리까지 입력하세요 :");
		double key = scan.nextDouble();
		System.out.println("당신의 키는 " + key);

		System.out.print("당신의 여자 입니까?(true or false) : ");
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 여자 입니까?" + gender);	
		scan.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = scan.nextLine();
		System.out.println("주소 : " + address);
		
	}

}
