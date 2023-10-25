package objex09;

public class Tv {
//tv의 회사, 모델명, 인치 수 , 전원,볼륨, 채널 설정 
//내가 넣은 값에 대한 회사, 모델 인치 수를 지정하고
//void를 이용한 전원 on,off설정
//int) 채널이 1개씩 감소하거나 증가
//int) 내가 지정한 값으로 볼륨 크기 조정
	
	//필드
	String company;
	String model;
	int inc;
	final int MAX_VOL = 100;
	int vol;
	final int MAX_CHA = 999;
	int cha;
	boolean power;
	Tv(String company, String model, int inc){
		System.out.println("생성자 호출");
		this.company = company;
		this.model = model;
		this.inc = inc;
		
	}
	
	void power(){
		power = !power;
		if(true) 
			System.out.println("전원:on");
		else 
			System.out.println("전원:off");
		}

		
	

}
