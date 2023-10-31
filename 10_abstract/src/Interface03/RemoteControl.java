package Interface03;

public interface RemoteControl {
// 인터페이스는 무조건 상수
	public static final int MAX_VOLUME = 100;
// public static final 을 붙이지 않으면 컴파일시 자동으로 붙인다
 int MIN_VOLUME = 0;
	
    public abstract void turnOn();
    // public abstract 붙이지 않으면 컴파일이시 자동으로 붙힘
    void turnOff();
    void setVolume(int volume);
    
    //default 메소드 : 실행문을 넣을 수 있다
    //재정의 하지 않으면 아래 메소드 실행, 재정의 하면 재정의한 메소드가 호출
   public default void setMute(boolean mute) {
    	System.out.println("나중에 추가된 메소드");
    	if(mute) {
    		System.out.println("무음");
    	}else {
    		System.out.println("무음 해제");
    	}
    }
    // static 메소드: 실행문을 넣을 수 있다
    static void infor() {
    	System.out.println("static() 메소드 호출 가능");
    }
}
