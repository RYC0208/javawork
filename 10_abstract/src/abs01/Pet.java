	package abs01;
	// abstract 가 하나라도 사용된다면 클래스 앞에 abstract 가 붙어야 함
	
	// 	
	public abstract class Pet {
		private String kind;
		private String color;
	
	
		Pet(String kind, String color){
			this.kind = kind;
			this.color = color;
		}
		//추상 메소드 : 선언부만 있고 실행 부분이 없는 메소드
	public abstract void sound();
	public abstract void pattern() ;
	
	
	void infor(){
		System.out.println("종류: " + kind + ", 색상: " + color);
	
	}
	}

