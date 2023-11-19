import javax.imageio.metadata.IIOMetadataFormatImpl;

public class placti {

	public static void main(String[] args) {
		//배열 선언 첫번째 방법
		//String[] coffee = new String[4];
		
		
		//배열 선언 두번째 방법 (첫번째 방법과 대괄호 위치만 다름)
		//String coffee[] = new String[4];
		
	/*	coffee[0] = "아메리카노";
		coffee[1] = "카페모카";
		coffee[2] = "라떼";
		coffee[3] = "카푸치노";*/
		
		//배열 선언 세번째 방법
	
		//String[] coffee = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
		
		//배열 선언 네번째 방법
		String[] coffee ={"아메리카노","카페모카","라떼","카푸치노"};
		
		//커피 주문
		System.out.println(coffee[0]+ " 하나");
		System.out.println(coffee[1]+ " 하나");	
		coffee[2] = "에스프레소"; //값을 변경
		System.out.println(coffee[2]+ " 하나");
		System.out.println(coffee[3]+ " 하나");
		System.out.println("주세요");
		
		//String이 아닌 다른 자료형
		int[] num= new int[3];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		double [] d = new double[] {1.2, 3.4, 5.6};
		boolean[] b = new boolean[] {true,true,false};
		System.out.println("---------------------------------");
	//======================================================
		
		//배열의 순회
		
		String[] coffee2 = {"아메리카노","카페모카","라떼","카푸치노"};
	
	
		for (int i = 0; i < 4; i++) {
			System.out.println(coffee2[i]+" 하나"); 	
		}
		System.out.println("주세요");
		System.out.println("------------------------");
		//배열의 길이를 이용한 순회 (length)
		for (int i = 0; i < coffee2.length; i++) {
			System.out.println(coffee2[i]+" 하나"); 	
		}
		System.out.println("주세요");
		System.out.println("------------------------");
		//enhanced for ( for-each) 반복문
		for(String cof : coffee2) {
			System.out.println(cof+" 하나");
		}System.out.println("주세요");
		
		//===================================================================
		// 다차원 배열 (2차원 배열)
		
		//소규모 영화관 좌석
		//A1 = A5
		//B1 = B5
		//C1 = C5
		
		String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
		String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
		String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
		
		//3(세로) x 5(가로)  크기의 2차원 배열
		String[][] seats = new String[][] {
			{"A1", "A2", "A3", "A4", "A5"},
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"}			
		};
		
		//B2 에 접근 하려면?
		System.out.println(seats[1][1]);
		
		//C5 에 접근 하려면?
		System.out.println(seats[2][4]);
		
		//첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
		String[][] seats2= {
				{"A1", "A2", "A3"},
				{"B1", "B2", "B3", "B4"},
				{"C1", "C2", "C3", "C4", "C5"}
		};
		//A3에 접근하려면?
		System.out.println(seats2[0][2]);
		//A5에 접근하려면? (ArrayIndexOutOfBoundsException 오류)
		//System.out.println(seats2[0][4]);
		
		//3차원이상의 배열도 가능
//		String[][][] marray = new String[][][] {
//			{{},{},{}},
//			{{},{},{}},
//			{{},{},{}}
//			};//3차원 배열
//===============================================================
			
		//다차원 배열 순회
		String[][] seats3 = new String[][] {
			{"A1", "A2", "A3", "A4", "A5"},
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"}			
		};
		
		for(int i = 0; i< 3; i++) {//세로
			for(int j = 0; j < 5; j++) {//가로
				System.out.print(seats3[i][j]+" ");
			}
			System.out.println();
		} System.out.println("--------------------");
	
	    //배열의 길이가 다른 경우
		String[][] seats4 = new String[][] {
			{"A1", "A2", "A3"},
			{"B1", "B2", "B3", "B4"},
			{"C1", "C2", "C3", "C4", "C5"}			
		};
		
		for(int i = 0; i< seats4.length; i++) {//세로
			for(int j = 0; j <seats4[i].length; j++) {//가로
				System.out.print(seats4[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		//세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
		String[][] seats5 = new String[10][15];
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		for(int i = 0; i < seats5.length; i++) {//세로
			for(int j = 0; j < seats5[i].length; j++) {
				seats5[i][j] = eng[i] + (j+1);
			}
			
		}
		//표 구매
		seats5[7][8] = "__";
		seats5[7][9] = "___";
		
		// 영화관 좌석 번호 확인
		for(int i = 0; i< seats5.length; i++) {//세로
			for(int j = 0; j <seats5[i].length; j++) {//가로
				System.out.print(seats5[i][j]+" ");
			}
			System.out.println();	
		}
	} 
}
