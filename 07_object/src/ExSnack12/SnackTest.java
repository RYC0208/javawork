package ExSnack12;

import java.util.Scanner;

public class SnackTest {

	public static void main(String[] args) {
	Snack snack1 = new Snack();
	Snack snack2 = new Snack("비스켓","사브레","달콤한 맛",1,2500);
	Scanner sc = new Scanner(System.in);
	System.out.println("과자의 종류 입력: ");
	snack1.setKind(sc.next());
	System.out.println("과자의 이름 입력: ");
	snack1.setname(sc.next());
	System.out.println("과자의 맛 입력: ");
	snack1.setflavor(sc.next());
	System.out.println("갯수 입력: ");
	snack1.setnumber(sc.nextInt());
	System.out.println("가격 입력: ");
	snack1.setprice(sc.nextInt());
	System.out.println(snack1.information());
	System.out.println(snack2.information());
	
	System.out.println(snack1.getname()+"의 수량 변경: ");
	snack1.setnumber(sc.nextInt());
	System.out.println(snack1.getname()+"의 금액 변경: ");
	snack1.setprice(sc.nextInt());
	System.out.println(snack1.information());
	
	System.out.println(snack2.getname()+"의 수량 변경: ");
	snack2.setnumber(sc.nextInt());
	System.out.println(snack2.getname()+"의 금액 변경: ");
	snack2.setprice(sc.nextInt());
	System.out.println(snack2.information());
	// snack1의 수량을 3개로 변경
	// snack1의 금액 변경
	// snack1의 정보 출력
	
	//snack2의 이름 변경
	//snack2의 금액 변경
	//snack2의 정보 출력

	
	}

}
