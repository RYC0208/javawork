package Array01;

import java.util.Arrays;

public class Array_copy08 {

	public static void main(String[] args) {
		
		int[] oldscore = {90,87,69,97,100};
		
		int[] newscore = new int [10];
		
		/*		for(int i=0; i<oldscore.length; i++) {
					newscore[i] = oldscore[i];
				}
				newscore[5] = 78;
				System.out.println(Arrays.toString(newscore));*/
		System.arraycopy(oldscore, 0, newscore, 0, 5);    // old를 0번 인덱스부터 뉴의 0번~5번 인덱스까지 붙여넣기
		System.out.println(Arrays.toString(newscore));
		
		String oldstr[] = {"java","python", "oracle"};
		String newstr[] = new String[10];
		
		System.arraycopy(oldstr, 0, newstr, 2, 3);
		System.out.println(Arrays.toString(newstr));
	}

}
