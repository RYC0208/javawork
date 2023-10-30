package inEX02;

public class TvTest {

	public static void main(String[] args) {
		AiTv ai = new AiTv();
		ai.power();
		ai.setcha(11);
		System.out.println("현재 채널: "+ai.getcha());
		
		System.out.println(ai.internet("java"));
		
		
		ai.setvol(17);
		System.out.println("현재 볼륨: "+ ai.getvol());
		System.out.println("장르: "+ai.genre("스릴러"));
		ai.power();
		
		PopularTv pa1 = new PopularTv();
		System.out.println(pa1.video("d"));
	}

}
