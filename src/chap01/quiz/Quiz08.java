package chap01.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		// TODO 가우스의 덧셈 방법을 이용하여 1 ~ n까지의 합 구하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int sum = 0;
		
		if((n / 2) == 0) {
			sum = (1 + n) * (n / 2);
		} else {
			sum = (1 + n) * (n / 2) + ((n / 2) + 1);
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		scan.close();

	}

}
