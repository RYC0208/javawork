package plac6;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		ArrayList<Grade> list = new ArrayList<Grade>();
		 int select = 0 ;
		 boolean check = false;
		 int gListIndex = 0;
		 boolean bo1 = true;
		 
		Scanner sc = new Scanner(System.in);
		while(bo1) {
			System.out.println("1. 학생 정보 및 점수 입력");
			System.out.println("2. login(출력은 login이 되어야만 출력 가능");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 합계와 평균 출력");
			System.out.println("5. logout");
			System.out.println("6. 프로그램 종료");
			System.out.println("메뉴를 선택하세요: ");
			select = sc.nextInt();
			switch(select) {
			
				case 1:
					System.out.println("id 입력: ");
					String id = sc.next();
					System.out.println("이름 입력: ");
					String name = sc.next();
					System.out.println("비밀번호 입력: ");
					String password = sc.next();
					System.out.println("나이 입력: ");
					int age = sc.nextInt();
					System.out.println("국어점수 입력: ");
					int kor = sc.nextInt();
					System.out.println("영어 입력: ");
					int eng = sc.nextInt();
					System.out.println("컴퓨터 입력: ");
					int com = sc.nextInt();
					System.out.println("수학 입력: ");
					int math = sc.nextInt();
					list.add(new Grade(id,name,password,age,kor,eng,com,math));
					break;
					
				case 2:
					int num = 1 ;
					while(true) {
						System.out.println("Id를 입력하세요: ");
						String id2 = sc.next();
						System.out.println("Password를 입력하세요: ");
						String password2 = sc.next();
					
						if (num>=3){
							System.out.println("3번의 로그인에 실패하였습니다. 본인 확인이 필요합니다.");
							break;
						}
						
						for (int i = 0; i < list.size(); i++) {
							
							if(id2.equals(list.get(i).getId())) {
								if(password2.equals(list.get(i).getPassword())) {
								
									gListIndex = i;
									System.out.println("로그인 성공");
									check = true;
									break;
									
								}
							}
						}  
						if (check) {
							break;
						} else {
							num++;
							System.out.println("Id 혹은 Password가 틀렸습니다. 다시 입력하세요");
						}
					}
					break;
				case 3:
					if(check == false) {
						System.out.println("로그인 후에만 출력 가능합니다.");
					} else {
						System.out.println(list.get(gListIndex).toString());
					}
					break;
				case 4:
					if(check == false) {
						System.out.println("로그인 후에만 출력 가능합니다.");
					
					}else {
						System.out.println("합계: "+	list.get(gListIndex).getTotalScore());
						System.out.println("평균: "+	list.get(gListIndex).getAvg());
					}
					
			
					break;
				case 5:
					System.out.println("로그아웃 되었습니다.");
					check = false;
					break;
				case 6:
					bo1 = false;
					break;
					
			} 
			
		}
		System.out.println("프로그램 종료.");
	}

}