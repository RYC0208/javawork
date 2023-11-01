package Ex01;

public class NumberController extends NumberMenu {
  private int num1;
  private int num2;
  
	@Override
	public void check(int num1, int num2){
	this.num1 = num1;
	this.num2 = num2;
	}
}
