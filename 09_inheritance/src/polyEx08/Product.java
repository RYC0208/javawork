package polyEx08;

public class Product {
// 필드 : 제품의 가격, 보너스
	int price;
	int bonusPoint;
	
//생성자	
		Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}/*String result1(){
		return "컴퓨터 구매 가격: "+ price + "받은 적립금: " + bonusPoint;
		}*/
}
