package polyEx08;

import java.util.ArrayList;

public class Buyer3 {
	int money = 800;
	int bonusPoint;
	ArrayList<Product>aList = new ArrayList<Product>();
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		aList.add(p);
		
		System.out.println(p+ " 구입");
	}void refund(Product p){
		if(aList.remove(p)) {
			money += p.price;
			money -= p.bonusPoint;
			System.out.println(p + "를 반품 되었습니다");
		} else {
			System.out.println("구입한 상품이 아닙니다.");
		}
	}
	void buyList() {
	//물건을 산 총 금액
	//물건 리스트 
		int sum = 0;
		String list = "";
		if(aList.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}
		/*		for(Product pro : proList) {
					sum += pro.price;
					list += pro.toString()+", ";
				}*/
		
		for(int i=0; i<aList.size();i++) {
		Product p1 = aList.get(i);
		sum += p1.price;
		list +=(i==aList.size()-1) ? p1:p1+ ", ";
		
		}System.out.println("구입한 물품의 총 합계"+sum+"만원 입니다.");
		System.out.println("구입한 물품 list: " + list);
	}
		
	}

