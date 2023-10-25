package objCar05;

public class CarTest {

	public static void main(String[] args) {
 Car mycar = new Car();
 Car fricar = new Car();
fricar.color="기아자동차";
fricar.model="k9";
fricar.color="흰색";
 System.out.println("내 차 정보: ");
 System.out.println("회사: "+mycar.company);
 System.out.println("모델: "+mycar.model);
 System.out.println("컬러: "+mycar.color);
 System.out.println("최고속도: "+mycar.MAX_SPEED+"KM");
 /*
  * mycar.run -> 변수
  * mycar.run(); > 메소드
  */
 System.out.println("------내 차 정보------");
System.out.println("내 차를 ");
mycar.run();

System.out.println("내 차의 현재 속도:"+mycar.speedup(30));
System.out.println("내 차의 현재 속도:"+mycar.speedup(40));
System.out.println("내 차의 현재 속도:"+mycar.speeddown(25));
System.out.println("내 차의 현재 속도:"+mycar.speeddown(0));
System.out.println("내 차를 ");
mycar.run();
System.out.println("친구 차를");
fricar.run();
System.out.println("친구차의 현재 속도:"+mycar.speedup(30));
System.out.println("친구차차의 현재 속도:"+mycar.speedup(40));
System.out.println("친구차의 현재 속도:"+mycar.speeddown(25));
System.out.println("친구차의 현재 속도:"+mycar.speeddown(0));

System.out.println("친구 차를");
fricar.run();


System.out.println("--------------");


System.out.println("-----친구 차 정보------");
System.out.println("회사: "+fricar.company);
System.out.println("모델: "+fricar.model);
System.out.println("컬러: "+fricar.color);
System.out.println("최고속도: "+fricar.MAX_SPEED+"KM");




	}
 
}
