package Array01;

public class Array_Ex03예제 {
	public static void main(String[] args) {
		// 1. 총점, 평균 구하기
		int score[] = {13,53,63,82,92};
		int sum = 0;
		
		
		for(int i=0;i<score.length; i++) {
			sum += score[i];
			
			System.out.println(sum);
		}   System.out.println("score의 합계 :"+sum);
		double avg = sum / (double)score.length;
		System.out.printf("score 합계의 평균:%.2f\n", avg);
		//2. 최대값, 최소값 구하기
		
		int num[] = {14,65,210,5235,5,230,21,660,9};
		int num2 = 0;
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(max<num[i]) {
				max = num[i];
			}
			if(min>num[i]) {
				min= num[i];
			}
		
		
		}
		System.out.println("num의 최대값"+max);
		System.out.println("num의 최소값"+min);
		int k =1;
		System.out.println(num[0+k]);
	}
		
		
}
