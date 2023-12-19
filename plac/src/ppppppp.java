import java.lang.reflect.Array;
import java.util.Arrays;

public class ppppppp {

	public static void main(String[] args) {
		int[] array = {5,2,1,10,7};
		Arrays.sort(array);
		int answer = 0;
		
		answer = array[array.length >>1];
		System.out.println(answer);
		String[] s2 = {"com", "b", "d", "p", "c"};
		String[] s1 = {"a", "b", "c"};
		int answer2 = 0;
		
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i] == s2[j]) {
					answer2++;
				}
			}
		}System.out.println(answer2);
		
		String my_string = "agoioweqmu";
		String answer3 = "";
		
		answer3 = my_string.replaceAll("[aosq]", "");
		
		System.out.println(answer3);
		
		
		
		int[] sides = {1,2,3};
        Arrays.sort(sides);
        int answer4 = sides[2] >= (sides[0]+sides[1]) ? 2 : 1;
        System.out.println(answer4);
        
        
	}

}
