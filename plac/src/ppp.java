import java.util.Arrays;
public class ppp {

	public static void main(String[] args) {
		String myString = "abasdlvzxx";
        String[] answer = myString.split("[x]+");
        String[] answer2 = new String[answer.length-1];
        Arrays.sort(answer);
        
        if(answer[0].isEmpty()){
            for(int i=0; i<answer2.length; i++){
                answer2[i] = answer[i+1];
            }
            System.out.println(Arrays.toString(answer2));
        }
        char c = 'A';
        System.out.println((int)'l');
        
        char[] c_list = new char[myString.length()];
        for(int i=0; i<c_list.length; i++){
            if((int)myString.charAt(i) <= (int)'l' ) {
            	c_list[i] = 'l';
            }else {
            	  c_list[i] = myString.charAt(i);
            }
        }System.out.println(Arrays.toString(c_list));
        String answer3 = new String(c_list);
        System.out.println(answer3);
	}
}
