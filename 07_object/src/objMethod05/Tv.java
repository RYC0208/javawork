package objMethod05;

import javax.print.attribute.SetOfIntegerSyntax;

public class Tv {

	//필드
	String comp = "삼성";
	String model = "거대거대 초대거대 TV - 20DE1P";
	String INC = "900인치";
	final int MAX_VOL = 100;
	int vol;
	final int MAX_CHA = 999;
	int cha;
	boolean start;
	
	//메소드
	void start() {
		start = !start;
		if(start)
			System.out.println("ON");
		else
			System.out.println("OFF");
	}
	
	 int chaup() {
		 cha+=2;
		 return cha;
	 }
	 int chadown(){
		 cha+=-2;
		 return cha;
	 }
	 int volup(int vo) {
		 this.vol = vo;
		 return this.vol;
		 
	 }
	 int voldown(int vo) {
		this.vol =vo;
		 return this.vol;
		  }
	 
}
