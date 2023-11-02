package plac3;

public class NumberController {
    public NumberController() {
}
    
    
	public boolean check(int num1, int num2) throws NumRangeException {
   boolean or ;
		if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
        	throw new NumRangeException("1~100 사이어야 합니다.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1+"은"+num2+"의 배수인가?"+true);
            return true;
        } else {
            System.out.println(num1+"은"+num2+"의 배수인가?"+false);
        	  return false;
        }
	}
}
