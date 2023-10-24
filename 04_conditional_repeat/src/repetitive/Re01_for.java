package repetitive;

public class Re01_for {

	public static void main(String[] args) {
		/*// 반복문 : 원하는 갯수만큼 반복하여 실행하고자 할 때
		 for(초기식; 조건식; 증감식) {
		 실행문(몇부터, 몇까지, 얼마나)
		
		}    += ? 숫자만큼 증감 , -=? 숫자만큼 감소
		 *	한줄이어도 if문과 동일하게 중괄호가 없어도 됨
		
		 * 
		 */
		
		for(int i=1; i<=100 ; i++) {
			System.out.println(i+". 안녕하세요\n     반갑습니다.");
		}
		System.out.println("@@@@@@@@@@@@");
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i +".번 출력");
			
		}
		System.out.println("@@@@@@@@@@@@");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i+". 1씩감소");
		}
		
		System.out.println("@@@@@@@@@@@@");
		
		//1~10까지 합계 구하기
		int b1 =10;
		for(int i=1; i<=10; i++) {
			b1 += i;

		}
		System.out.println("10부터 1까지의 합계: "+b1);
		}
}
