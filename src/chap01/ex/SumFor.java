package chap01.ex;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		// TODO 1 ~ n까지의 합 구하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		scan.close();

	}

}
