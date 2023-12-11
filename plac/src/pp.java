import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class pp {

	public static void main(String[] args) {
		String myString = "asdfQWEADFfsda";
		String answer = "";
		myString = myString.toLowerCase();
		char[] charList = new char[myString.length()];
		
		for(int i=0; i<myString.length(); i++) {
			charList[i] = myString.charAt(i);
			if(myString.charAt(i) == 'a') {
				charList[i] = 'A';
			}
		}for(int i=0; i<charList.length; i++) {
			answer += charList[i];
		}
		System.out.println(myString.split("a"));	
		String m = "1";
		System.out.println("-------------------");
		String binomial = "43 + 13";
        int answer11 = 0;
        String[] l =  binomial.split("[ ]+");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[2]);
        System.out.println(l[1]);
        if(l[1].equals("+")) {
        	System.out.println(a+b);
        }
        int n = 3;
        int[][] answer12 = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j) {
                	answer12[i][j] = 1;
                }
            }
        }
       
	}

}
