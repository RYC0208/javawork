package objMethod05;

import java.util.Scanner;

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println("TV의 정보: ");
		System.out.println("회사: "+tv.comp);
		System.out.println("모델 명: "+tv.model);
		System.out.println("인치 수: "+tv.INC);
		
		tv.start();
		
		System.out.println("현재 채널:"+tv.chaup());
		System.out.println("현재 채널:"+tv.chaup());
		System.out.println("현재 볼륨:"+tv.volup(4));
		tv.start();
		}
	
	
	
	}


