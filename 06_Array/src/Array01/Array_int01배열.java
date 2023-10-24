package Array01;

import java.nio.file.spi.FileSystemProvider;

public class Array_int01배열 {

	public static void main(String[] args) {
		// 배열 : 같은 자료형을 연속된 저장공간에 저장함
		//       배열의 길이는 늘리거나 줄일 수 없다
		//       int[] 변수명 = new int[갯수]
		//       int 변수명[] = new int[갯수]
		
		// 저장공간을 확보만 하고 값은 나중에 넣을 때 사용
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];
		// 배열을 만들면서 값을 바로 넣을 때 사용
		int arrayInt3[] = {1,2,3,4,5};
		       //index 번호:0,1,2,3,4
						System.out.println(arrayInt3[0]);
						System.out.println(arrayInt3[3]);
						System.out.println();
						
						arrayInt3[1] = 20;
				
						for(int i=0; i<=4; i++) {
							if(i==4)
								System.out.println(arrayInt3[i]);
							System.out.print(arrayInt3[i] + ", ");
					
						}
						System.out.println("\n---------------------");
						arrayInt3[0] = 0;
						arrayInt3[1] = 2;
						arrayInt3[2] = 4;
						arrayInt3[3] = 6;
						arrayInt3[4] = 8;
						
						for(int i=0; i<=4;i++) {
							arrayInt3[i] = i+2;
							System.out.print(arrayInt3[i] + ", ");
						}
						System.out.println("\n---------------------");
						int int1[] = {3,4,5,6,7,8,9,10};
						int int2[] = new int[10];
						
						System.out.println("int1의 길이 :"+int1.length);
						System.out.println("int2의 길이 :"+int2.length);
					
						for(int i=0; i<int1.length; i++) // length를 쓸 때는 =를 넣지 않는다.
							System.out.println(int1[i]);
			
		//문제1 배열의 길이가 5인  배열에 값을 for문으로  0,3,6,9,12를 넣고
		//     합게를 구하여 출력하시오.
						
		int in1[] = {0,3,6,9,12};
		int sum= 0;
		for(int i=0;i<in1.length; i++) {
			sum+= in1[i]; //sun = sum+in1[i] 우변의 값을 좌변으로
			
		}System.out.println("배열{0,3,6,9,12}의 합계::"+ sum);
		
		int in2[] = new int[5]; 
		int m1 = 0;
		
		for(int i=0; i<in2.length;i++) {
			int n1 = 0;
			in2[i]+= n1;
			
			m1 = in2[i];
			
			System.out.println(m1);
			
		}
	}

}
