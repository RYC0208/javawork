package print02;

public class Ch01_printf {

	public static void main(String[] args) {
		//십진수 출력 
    System.out.printf("%d\n", 3);
    System.out.printf("%d %d\n", 5, 8);
    System.out.printf("주민등록번호 : %d - %d\n", 990208, 1490000);
	
    //8진수 출력
    System.out.printf("%o\n" , 9);
    
    //16진수 출력
    System.out.printf("%x\n", 13);
    System.out.printf("%X\n", 13);
    
    //실수형 출력 
    System.out.printf("%f\n", 3.1234324);
    
    //문자 1개 출력
    
    System.out.printf("%c\n", 'n');
    
    //문자열 출력
    System.out.printf("%s\n", "abcdef");
    
    //boolean타입 출력
    System.out.printf("%b\n", true);
    System.out.printf("%b\n", 6 >= 3);
    
    System.out.printf("올해는 %d년 %d월 이고, 우리나라의 평균키는 %f입니다\n", 2023, 10, 164.874);
    
    System.out.printf("이 과정의 정원은 %d명이고, 현재는 %d명 수강중 입니다. 평균 %f%% 달성했습니다\n", 20, 9, 45.0);
    
    
    
	}

}
