package polyEx08;

public class Buyer02 {
	int money = 800;
	int bonusPoint;
	int count;
	Product[] proList = new Product[3];
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		proList[count++] = p;
		
		System.out.println(p+ " 구입");
	}
	void buyList() {
	//물건을 산 총 금액
	//물건 리스트 
		int sum = 0;
		String list = "";
				for(Product pro : proList) {
					sum += pro.price;
					list += pro.toString()+", ";
				}
				/*
				for(int i=0; i<proList.length;i++) {
				sum+=proList[i].price ;
				list += proList[i]+", ";
				
				}*/System.out.println("구입한 물품의 총 합계"+sum+"만원 입니다.");
		System.out.println("구입한 물품 list: " + list);
	}
		
	}

