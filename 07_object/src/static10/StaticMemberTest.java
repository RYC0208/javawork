package static10;

public class StaticMemberTest {
	int a;// 인스턴스 변수
	static int b; //정적 변수

	public static void main(String[] args) {
		int c; //지역 변수
		System.out.println("객체 생성을 하지 않고도 정적 변수는 호출 가능:"+ StaticMember.sName);
		StaticMember.sMe3();
		
		StaticMember sm1 =new StaticMember();
		
	//	for(int i= 0;) { // i = 지역 변수
			
	//	}if(2<5) {
		//	int aaaaa=0;//지역 변수
		//}
		System.out.println("인스턴스 변수: "+sm1.num);
		System.out.println("정적 변수: "+sm1.sNum);
		
		sm1.Me1();
		StaticMember.sMe3();
		
		StaticMember sm2 = new StaticMember();
		sm1.sNum = 100;
		
		//클래스를 이용하는 모든 객체들의 공통으로 사용
	
		System.out.println(StaticMember.sNum);
		System.out.println(sm1.sNum);
		System.out.println(sm2.sNum);
		System.out.println(StaticMemberTest.method1());
	}//정적 main()메소드 끝//
	static int method1() {
		return 10;
	}
	
	

}
