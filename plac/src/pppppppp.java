
public class pppppppp {

	public static void main(String[] args) {
        
		String my_string  = "ABcDeFGHij";
		String answer1 = "";
		
		for(char c : my_string.toCharArray()) {
			if(Character.isUpperCase(c)) {
				answer1 += Character.toLowerCase(c);
			}else {
				answer1 += Character.toUpperCase(c);
			}
		}System.out.println(answer1);

		
		int hp =999;
        int answer = 0;
        
        answer += hp/5;
        System.out.println(answer);
        answer += hp%5/3;
        System.out.println(answer);
        answer += hp%5%3/1;
        System.out.println(answer);
	}

}
