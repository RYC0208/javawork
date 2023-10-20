package conditional01;

import java.util.Scanner;

public class Con03_multi_if {

	public static void main(String[] args) {
		//사용자로 부터 점수를 입력받아 학점 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력(100점 만점):");
		int score1 = sc.nextInt();
		if(score1>100)
			System.out.println("잘못된 점수입니다.");
		
		
		else if(score1>=90)
			System.out.println("A학점");
		else if(score1>=80)
			System.out.println("B학점");
		else if(score1>=70)
			System.out.println("C학점");
		else if(score1>=0)
			System.out.println("D학점");
		else
			System.out.println("잘못된 점수입니다.");
		
		System.out.println("점수 입력(100점 만점):");
		int score2 = sc.nextInt();
	
		
		if(score2 > 100 || score2 < 0)
		 System.out.println("점수를 잘못 입력 하였습니다.");
		else if(score2>=90)
			System.out.println("A학점");
		else if(score2>=80)
			System.out.println("B학점");
		else if(score2>=70)
			System.out.println("C학점");
		else if(score2>=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");

		
		
	}

}
