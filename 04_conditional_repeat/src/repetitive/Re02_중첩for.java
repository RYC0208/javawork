package repetitive;

public class Re02_중첩for {

	public static void main(String[] args) {
		// 중첩 for문
		/*	for(int lv=1; lv<=3; lv++) {
				for(int exp=0; exp<10; exp++) {
					System.out.println("LV="+lv+", exp=" + exp);
					
				}
				System.out.println("@@@@@");
				
			} 
		
		 * 구구단 2단 출력
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * 2*9=19
		 
			for(int gu=2; gu<=9; gu++) {
				for(int i=1; i<=9; i++) {
					System.out.println(gu + "*"+ i+"="+gu*i);
					System.out.printf("%d*%d=%2d\n",gu,i,gu*i);
				}
				System.out.println(                 );
			}*/

		/*		
				for(int ddan=2; ddan<=9; ddan++) {
					
			
				for(int i2 = 1; i2<=9; i2++) {
					System.out.println(ddan+"*"+i2+"="+ddan*i2);
				}
				}
				*/
						for(int dan=1; dan<=9; dan++) {
							
							for(int i=2; i<=9; i++) {
								System.out.printf("%d*%d=%2d ",i,dan,i*dan);
								
							}
							System.out.printf("\n");
						}

	}

}
