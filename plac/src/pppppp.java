import java.util.Arrays;
import java.util.Collections;

public class pppppp {

	public static void main(String[] args) {
		String my_string ="cvsgiorszzzmrpaqpe";
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		String answer = "";
		
		for(int i=0; i<index_list.length; i++) {
			answer += my_string.charAt(index_list[i]);
		}System.out.println(answer);
		
		
		String banana = "banana";
		String[] aanswer = new String[banana.length()];
		String str = "";
		int n = 0;
		String sum = "";
		// a, na , ana, nana, anana, banana
		for(int i=6; i>0; i--) {
			for(int j=0; j<i; j++) {
			sum += banana.charAt(j);
			System.out.println(sum);
		}
			System.out.println("---------------------");
			aanswer[n] = sum;
			n++;
			sum = "";
			System.out.println(Arrays.toString(aanswer));
		}

	}

}
