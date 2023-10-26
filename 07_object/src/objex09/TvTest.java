package objex09;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
public class TvTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회사명을 입력하세요: ");
		String com1 = sc.next();
		System.out.println("모델명을 입력하세요: ");
		String com2 = sc.next();
		System.out.println("크기(인치)를 입력하세요: ");
		int com3 = sc.nextInt();
		Tv tv1 = new Tv(com1,com2,com3) ;
		System.out.println("회사 명: "+tv1.company);
		System.out.println("모델 명: "+tv1.model);
		System.out.println("크기(인치): "+tv1.inc);
		System.out.println("_________________");
		String stop ;
		System.out.println("1,2,3,4,5,");		
		while(true) {
		int sum = sc.nextInt();
	
		if(sum == 1) {
			System.out.println("볼륨을 키웠습니다: "+tv1.volup()+"Vol");
			continue;
		} if(sum == 2) {		
			System.out.println("볼륨을 줄였습니다: "+tv1.voldown()+"Vol");
			continue;
		} if(sum == 3) {
			System.out.println("채널이 변경 되었습니다: "+tv1.chaup()+"Ch");
			continue;
		}if(sum == 4) {
			System.out.println("채널이 변경 되었습니다: "+tv1.chadown()+"Ch");
			continue;
		}if(sum == 5) {
			System.out.println(tv1.power);
			break;
		}
		else {
			System.out.println("다시 입력하세요.");
		}
		
		
	
		}
	}
}
