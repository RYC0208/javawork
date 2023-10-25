package repetitive;

public class Re07_for_여러변수사용 {

	public static void main(String[] args) {

		int n1, n2, n3;
		n1=n2=n3=10;
		
		int n4=8, n5=9, n6=21;
		
		// for문에 여러개의 변수 사용 가능
		// 조건식에는 변수가 하나만 들어가야한다
		for(int i=1, j=20, z=45; i<=10; i++, j--, z+=2) {
			System.out.println("i="+i+", j="+j+", z="+z);
		}	
		for(int i=1, j=20, z=45; i<=10; i++, j--, z+=2) {
			System.out.println("i="+i+", j="+j+", z="+z);}
		//while(true) 한것과 동일
		//초기식 없음, 조건식 없음, 증감식도 없음
		for(;;) {
			System.out.println(n1++);
			if(n1==15)
				break;
		}
		outter : for(int dan=2; dan<=9; dan++) {
			mid : for(int i=1; i<=9; i++) {
				for(int z=1; z<=5; z++) {
				System.out.println(dan+","+i+","+z);
				if(z==3)
					break mid;
				}
			}
			System.out.println("mid for문 종료");
		}
		System.out.println("outter for문 종료");
		
	
	}

}
