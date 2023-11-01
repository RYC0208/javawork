package exception01;

public class Finally08 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			//예외가 발생할 수 있는 경우
			System.out.println(3);
			//int result = 30/0;
			System.out.println(4);
			return;
		} catch(Exception e) {
			//예외가 발생했을 때 실행
			System.out.println(5);
		}finally {
			//finally안에 넣으면 실행이 되지 않는 경우는 없음 = 무조건 실행
		System.out.println(6);
		}//try 구문 안에 return 이 있으면 실행되지 않음
		//꼭 실행해야 되는 출력문은 finally 안으로 넣으면 됨
		System.out.println(7);
	}
	public static void main1(String[] args) {
		
		String bus = "7770번 버스";
		int min = 5;
		double km = 1.7;
		System.out.println(bus+", 도착예정 시간: "+min+"분, 남은 거리: "+km);
		
	}
	}

