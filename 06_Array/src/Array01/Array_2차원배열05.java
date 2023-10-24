package Array01;

import java.util.Arrays;

public class Array_2차원배열05 {

	public static void main(String[] args) {
		int score1[][]= new int[2][5];
		
		int[][] score2 = {{1,2,3,4,5},       // 인덱스 번호 0
						  {6,7,8,9,10},      // 1
						  {11,12,13,14,15}}; // 2
		        //인덱스 번호 [0][1][2][3][4]
		System.out.println(score2[1][2]);
		System.out.println(score2[2][4]);
		System.out.println("score의 길이 : " + score2.length); //score2의 행의 길이
		System.out.println("score의 인덱스 번호 0번의 길이: "+score2[0].length);//score2 0행의 열의 길이

		
		for(int i=0; i<score2.length; i++) {
			for(int j=0; j<score2[i].length;j++) {
				System.out.print(score2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		int iarr[][] = new int [4][3];
		int co =0;
		for(int i=0;i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				co += 12;
				iarr[i][j] = co;
				System.out.print(iarr[i][j]+" ");
				
			}
			System.out.println();
			
/*			
			int iarr2[][] = {{1,2,3,},
							{4,5},
							{6,7,8,9}};
			
			for(int i1=0;i1<iarr2.length;i1++) {
				for(int j1 =0; j1<iarr2[i1].length; j1++) {
	 		System.out.print(iarr[i1][j1]+" ");
			
				}System.out.println();*/
				
			
		}
	}
	

}
