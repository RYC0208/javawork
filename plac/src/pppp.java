
public class pppp {

	public static void main(String[] args) {
		String number = "78720646226947352489";
        int sum = 0;
        for(int i=0; i<number.length(); i++){
            sum += Character.getNumericValue(number.charAt(i));
            System.out.println(sum);
        }
        
        
        
        
        //-------------------------------------------------------
        
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        
        String answer = "";
        
        for(int i=c-1; i<my_string.length(); i++){
            if(m == 4){
            answer += my_string.charAt(i);
            m = 0;
            }m++;
        }
        
        int[] date1 = {2002,01,06};
        int[] date2 = {2002,01,07};
        String aa = "";
        String bb = "";
        int answerr = 0;
        for(int i=0; i<date1.length; i++) {
//        	aa += Integer.toString(date1[i]);
//        	bb += Integer.toString(date2[i]);
        	aa = String.format("%04d%02d%02d", date1[0], date1[1], date1[2]);
        	bb = String.format("%04d%02d%02d", date2[0], date2[1], date2[2]);
        }
        answerr = Integer.parseInt(aa) < Integer.parseInt(bb) ? 1 : 0;
        

	}
}
