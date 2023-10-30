package Static_instance;

class stin{
	// 인스턴스 멤버 : 반드시 객체가 생성되어야(객체에 저장공간 마련) 사용가능!
	// 인스턴스 멤버와 정적멤버 모두 사용가능
	int inNum = 10;
	int plus(int x) {
		return inNum *x;
	}
		// 정적 멤버: 클래스가 올라올 때 클래스에 저장공간 마련
		// 인스턴스 멤버 사용 불가: 이유는 객체가 만들어졌다는 보장이 없기 때문
		static int sNum =30;	
		static int plus() {
		//	int re = inNum +10; // inNum을 사용하려 반드시 객체가 만들어져야만 사용가능
			int re = sNum +10;
		return sNum+10;
	}
}

public class Static_instanceTest {

	public static void main(String[] args) {
		int sum = 0;
	 System.out.println(stin.sNum);
	 System.out.println(stin.plus());
	 stin st = new stin();
	 
	 System.out.println(st.inNum);
	 System.out.println(st.plus(50));

	for(int i=1; i<=st.sNum; i++) {
	sum += st.plus()*st.plus(i);
	System.out.println(sum);
	}System.out.println(sum);
	}

}
