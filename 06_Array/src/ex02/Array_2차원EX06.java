package ex02;

import java.util.Arrays;

public class Array_2차원EX06 {

	public static void main(String[] args) {
		//2차원 배열에 각 학생(5명)(행)별 점수 입력
		//국어, 영어, 수학 (열)
		int score[][] = {{95,100,89},
						{75,64,65},
						{72,38,88},
						{95,52,65},
						{67,63,72}};
		/*
		 * 이름 국어 영어 수학 총점 평균
		 * ---------------------
		 * 이준 95  100 89 284 94.6
		 * 이준 95  100 89 284 94.6
		 * 이준 95  100 89 284 94.6
		 * 이준 95  100 89 284 94.6
		 * 이준 95  100 89 284 94.6
		 * ---------------------
		 * 총점 475 500 445 1420 473
		 * 평균 95  100 89 284  94.6
		 */
		int kor = 0;
		int eng = 0;
		int math= 0;
		int a1 = 0;
		double a2 = 0;

		for (int i=0; i<score.length; i++) {
			
			System.out.print(i+1+"\t");
			
			int num = 0;
			kor += score[i][0];
			eng+=score[i][1];
			math+=score[i][2];
			
			for(int j=0; j<score[i].length;j++) {
				
				num += score[i][j];
				
				System.out.print(score[i][j]+"\t");
			} /* System.out.print(num+"\t");*/
			double avg = (double)num/score[i].length;
			/*			System.out.printf("%.2f \n", avg);*/
			a1 +=  num;
			a2 +=  (double)avg;
			
            System.out.printf("%d\t%.1f\n", num, avg);
		}
		System.out.printf("총점\t"+kor+"\t"+eng+"\t"+math+"\t"+a1+"\t%.1f\n", a2);
		System.out.printf("평균\t"+(double)kor/5+"\t"+(double)eng/5+"\t"+(double)math/5+"\t"+(double)a1/5+"\t%.1f", a2/5);
		
		/*int num = 0;
			int num1 = 0;
			int num2 = 0;
			for(int ii=0; ii<score.length; ii++) {
			
			num += score[ii][0];
			num1 += score[ii][1];
			num2 += score[ii][2];
			} System.out.println("총점\t"+num+"\t"+num1+"\t"+num2);*/
		
	}

}
