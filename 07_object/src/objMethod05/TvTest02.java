package objMethod05;

import java.util.Scanner;

public class TvTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Tv tv = new Tv();
		System.out.println("TV의 정보: ");
		System.out.println("회사: "+tv.comp);
		System.out.println("모델 명: "+tv.model);
		System.out.println("인치 수: "+tv.INC);
		
		tv.start();
		
		for(int i=0; i<tv.MAX_VOL;i++) {
			System.out.println("볼륨을 입력하세요:");
			int vol;
				
			}
		
	}

}
