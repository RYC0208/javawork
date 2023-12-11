import java.util.Arrays;

public class p {

	public static void main(String[] args) {
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		int[] copy = new int [numLog.length];
		String answer = "";
		
		for(int i=0; i<numLog.length; i++) {
			copy[i] = numLog[i];
		}
		for(int i=0; i<numLog.length-1; i++){
			int num = copy[i+1] - numLog[i];
			System.out.println(num);
			switch(num) {
			case 1:
				answer += "w";
				break;
			case -1:
				answer += "s";
				break;
			case 10:
				answer += "d";
				break;
			case -10:
				answer += "a";
				break;
			default :
				break;
			}System.out.println(answer);
		}
		String myString = "oxooxoxxox";
		String[] str = myString.split("x", -1);
		int[] answer1 = new int[str.length];
		for(int i=0; i<str.length; i++) {
			answer1[i] = str[i].length();
			System.out.println(Arrays.toString(answer1));
		}
		int[] arr = {1, 1, 1, 1, 0};
		int idx = 3;
        int answer2 = 0;
        
        for(int i=0; i<arr.length; i++){
            if(i >= idx && arr[i] == 1){
                answer2 = i;
                
            }else {
                answer2 =  -1;
            }System.out.println(answer2);
        }
        char[] ir = new char[5];
        System.out.println(Arrays.toString(ir));
        
	}

}
