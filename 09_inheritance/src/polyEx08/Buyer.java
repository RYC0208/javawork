package polyEx08;

public class Buyer {
	int money = 800;
	int bonusPoint;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}else
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p+ " 구입");
	}
}
