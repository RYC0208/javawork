package static10;


	public class StaticMember {
//인스턴스 필드
		int num = 1;
		String name = "홍길동";
		
//정적 필드
		static int sNum =2;
		static String sName = "김정적";
		
//인스턴스 메소드
//인스턴스 멤버와 정적 멤버 모두 사용가눙
		void Me1() {
			System.out.println("인스턴스 메소드 Me1()");
		}
		String Me2() {
			System.out.println("인스턴스 메소드w Me2()");
			return "Me2()";
		}
//정적 메소드 | 객체를 생성하지 않고도 사용 할 수 있고 객체를 생성해도 사용 가능
		static void sMe3() {
			//System.out.println(num);// 객체를 생성해야만 사용 가능
			System.out.println(sNum);// 객체를 생성하든 안하든 사용가능
			System.out.println("정적 메소드 sMe3()");
		}static int sMe4() {
			System.out.println("정적 메소드 sMe4()");
			return 4;
		}
} 
