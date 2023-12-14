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
     int a = 1;
       int[][]arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
       
       
       for(int i=0; i<arr.length; i++) {
    	   for(int j=0; j<arr[i].length; j++) {
    		   if(arr[i][j] != arr[j][i])
    			   a = 0;
    		   	   break;
    	   }
       }
	}
}
