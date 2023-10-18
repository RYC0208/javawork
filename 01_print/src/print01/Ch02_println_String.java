package print01;

public class Ch02_println_String {

	public static void main(String[] args) {
		System.out.println("문자열 " + "두번째 문자열");
		System.out.println("문자열"+ 10 + 20); // 문자열이 나오면  그 뒤는 모두 문자열로 인식
		
		System.out.println(10 + 20 + " 문자열"); // 숫자로 시작하면 연산 후 문자열이 나오면 그 뒤로 쭉 문자열
		
		System.out.println(10 + 20 + "문자열" + 10 + 20);
		
		System.out.println(10 + 20 + "문자열" + (10 + 20)); //문자열이 나온뒤 연산이 필요하면 괄호를 사용
		
	} 

}
