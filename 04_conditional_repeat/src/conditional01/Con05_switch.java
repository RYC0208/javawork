package conditional01;

import java.util.Scanner;

public class Con05_switch {

	public static void main(String[] args) {
		int num1 = 6;
		switch(num1) {
	case 1:
		System.out.println("1이네여");
		break;  // break를 만나면 switch문을 빠져 나와버림
	case 2:
		System.out.println("2네용");
		break;
	default :
			System.out.println("1과 2가 아닌 수수수");
			
			
		}
		
				
		char ch = 'k'; // k , l , p
		
		switch(ch) {
		case 'k':
			System.out.println("김씨 입니다");
			break;
		case'l':
			System.out.println("이씨 입니다");
			break;
		case'p':
			System.out.println("박씨 입니다");
			break;
			default:
				System.out.println("성이, 김,이,박이 아닙니다용");
				
		}
		System.out.println();
		
		
		switch(ch) {
		
		case 'k':
			System.out.println("김씨 입니다");			
		case'l':
			System.out.println("이씨 입니다");			
		case'p':
			System.out.println("박씨 입니다");			
			default:
				System.out.println("성이, 김,이,박이 아닙니다용");
				
		}
		
		int month = 11;
		switch(month) {
		case 1 :
			System.out.println("겨울에 태어났군요");
			break;
			
		}
		
		switch(month) {
		case 1: case 2:case 12:
		 System.out.println("겨울이다@");
		break;
		
		case 3:
		case 4:
		case 5:
		     System.out.println("봄이다");
		     break;
		case 6:
		case 7:
		case 8:
			
		case 9:
		System.out.println("여름이다");
		break;
		
		default:
		System.out.println("가을이다");
		break;
		
		}
	}

}
