package chap01.ex;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		// TODO 1 ~ n까지의 합 구하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {	// 사전 판단 반복 구조
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		
		scan.close();

	}

}
