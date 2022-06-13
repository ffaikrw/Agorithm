package chap01.quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO n = 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력하는 코드 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		
		System.out.println(sum);
		
		scan.close();

	}

}
