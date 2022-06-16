package chap01.ex;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO 1 ~ n까지의 합 구하기 - 양수만 입력
		
		Scanner scan = new Scanner(System.in);
		
		// 양수가 나올 때까지 입력을 받고, 양수가 나오면 1 ~ n까지의 합 계산하기
		
		int sum = 0;
		
		while(true) {
			
			System.out.print("n : ");
			int n = scan.nextInt();
			
			if(n > 0) {
				for(int i = 1; i <= n; i++) {
					sum += i;
				}
				break;
			}
		}
		
		System.out.println(sum);
		
		scan.close();
		
	}

}
