import java.util.Arrays;

public class ppppppppp {

	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		int k = 5 ;
		String str1 = Integer.toString(k);
		String str2 = "";
		int answer = 0;
		
		for(int z=0; z<=j; z++) {
			str2 = Integer.toString(z);
			for(int x=0; x<str2.length(); x++) {
				if(str1.charAt(0) == str2.charAt(x)) {
					answer++;
				}
			}
		}System.out.println(answer);
	}
}

